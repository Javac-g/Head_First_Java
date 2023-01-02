package com.company.Ch5.MyWork;

import java.util.Scanner;

public class GameLauncher {
    private final static Scanner scanner = new Scanner(System.in);
    private final static GameSetup gameSetup = new GameSetup();
    private static boolean gameOver;
    private static int life;
    private static int strike = 0;
    private static int N = 0;

    public static void warProcess(){
        int index = -1;
        for (int i = 0; i < gameSetup.getBattleField().size();i++){
            if (!gameSetup.getBattleField().get(i).getAlive()){
                index = i;
                --life;
                System.out.println("HP: " + life);
                gameSetup.getBattleField().remove(index);
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
            processMiss(x,damagedArea);


        }


    }
    public static void processMiss(Ship ship,String area){
        int count = 0;
        for (String c: ship.getCoords()){
            if (c.equals(area)){
                count++;
            }
        }
        if (count == 0){
            System.out.println("Miss [" + ship.getName() + "]");
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
            System.out.println("You took " + N + " guesses");


        }
    }
    public static String processMove(){
        System.out.println("Enter Field: ");
        N++;
        return scanner.nextLine();
    }
    public static void processShooting(){
        processWin(life);
        String damagedArea = processMove().toUpperCase();
        processDamage(damagedArea);
        processWin(life);
        processKill(strike);
        ;
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
