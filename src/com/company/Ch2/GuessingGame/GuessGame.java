package com.company.Ch2.GuessingGame;

import com.company.Ch2.Shapes.Shape;

import java.util.Random;

public class GuessGame {

    public static void startGame(){
        Player p1 = new Player("Max");
        Player p2 = new Player("Jonn");
        Player p3 = new Player("Adam");

        Player[] winner = {p1, p2, p3};

        Random numb = new Random();

        int X = numb.nextInt(1,10);

        int Match = -1000;

        System.out.println(X);

        while (Match != X){
            for (Player player : winner) {
                Match = player.guess();
                if (Match == X){
                    break;
                }
            }

        }

        for (Player player:winner){
            if (player.getNumber() == Match){
                System.out.println("Winner: " + player.getName());
            }
        }
    }
}
