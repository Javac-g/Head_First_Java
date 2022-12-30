package com.company.Ch5;

import java.util.Objects;
import java.util.Scanner;

public class GameLauncher {
    private final static Scanner scanner = new Scanner(System.in);
    private final static GameSetup gameSetup = new GameSetup();
    private static boolean gameOver;
    private static int life;

    public static void warProcess(){
        System.out.println("Test 2");

        for (int i = 0; i < gameSetup.getBattleField().size();i++){
            if (!gameSetup.getBattleField().get(i).getAlive()){
                --life;
            }
        }
    }
    public static void shooting(String damagedArea){
        System.out.println("Test 1");
        if (life < 0){
            System.out.println("Win all ships killed");
            gameOver = true;
        }
        for (int i = 0;i < gameSetup.getBattleField().size();i++){
            Ship x = gameSetup.getBattleField().get(i);
            if (x.getLife() == 0){
                x.setAlive(false);
                System.out.println("Killed: " + x.getName());

            }
            if (!x.getCoords().get(i).equals(damagedArea)){
                if(!x.getAlive()){
                    continue;
                }
                System.out.println(x.getName() + ": MISS");
            }
            for (int j = 0;j < x.getCoords().size();j++){
                if (x.getCoords().get(j).equals(damagedArea)){
                    x.setLife(x.getLife()-1);
                    System.out.println("DAMAGE: "+ x.getCoords().get(j) + "[" + x.getName() + "]");
                }
            }
        }
    }

    public static void main(String...args){
        life = gameSetup.getBattleField().size();
        System.out.println("Life: " + life);


        System.out.println("\nSea buttle");
        while(!gameOver){
            warProcess();
            System.out.println("Enter Field: ");
            String field = scanner.nextLine();
            shooting(field);

        }
    }
}
