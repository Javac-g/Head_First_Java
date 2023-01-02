package com.company.Ch5.ChapterExample;

import java.util.Random;
import java.util.Scanner;

public class SimpleTestDrive {

    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        SimpleShip ship = new SimpleShip();
        ViewHelper viewHelper = new ViewHelper();
        Random r = new Random();



        int numOfGuesses = 0;
        int startX = r.nextInt(0,4);
        int[] location = {startX,startX+1,startX+2};
        ship.setLocationCells(location);
        boolean isAlive = true;
        while (isAlive){

            int userGuess = viewHelper.getUserInput("Enter a number:");
            numOfGuesses++;
            String result = ship.checkYourself(userGuess);
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("Guesses num : " + numOfGuesses);
            }

        }


    }
}
