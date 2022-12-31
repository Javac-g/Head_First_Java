package com.company.Ch5;

import java.util.Objects;
import java.util.Scanner;

public class GameLauncher {
    private final static Scanner scanner = new Scanner(System.in);
    private final static GameSetup gameSetup = new GameSetup();
    private static boolean gameOver;
    private static int life;
    private static int strike = 0;

    public static void warProcess(){
        for (int i = 0; i < gameSetup.getBattleField().size();i++){
            if (!gameSetup.getBattleField().get(i).getAlive()){
                --life;
            }
        }
    }
    public static void processDamage(String damagedArea){
        for (int i = 0;i < gameSetup.getBattleField().size();i++){
            Ship x = gameSetup.getBattleField().get(i);
            for (int j = 0;j < x.getCoords().size();j++){
                if (x.getCoords().get(j).equals(damagedArea)){
                    x.setLife(x.getLife()-1);
                    System.out.println("DAMAGE: "+ x.getCoords().get(j) + "[" + x.getName() + "]");
                    strike+=1;

                }
            }


        }
    }
    public static void processKill(int strike){
        if(strike == 3){
            for (int i = 0;i < gameSetup.getBattleField().size();i++) {
                Ship x = gameSetup.getBattleField().get(i);
                if (x.getLife() == 0) {
                    x.setAlive(false);
                    System.out.println("Killed: " + x.getName());
                    GameLauncher.strike = 0;

                }
            }
        }
    }
    public static void processWin(int life){
        if (life == 0){
            System.out.println("Win all ships killed");
            gameOver = true;
        }
    }
    public static String processMove(){
        System.out.println("Enter Field: ");
        return scanner.nextLine();
    }
    public static void processShooting(){


        processWin(life);
        processKill(strike);
        String damagedArea = processMove().toUpperCase();
        processDamage(damagedArea);
    }

    public static void main(String...args){
        life = gameSetup.getBattleField().size();



        System.out.println("\nSea battle");

        while(!gameOver){
            warProcess();
            processShooting();

        }
    }
}
