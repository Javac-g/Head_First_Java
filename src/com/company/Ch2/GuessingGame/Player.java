package com.company.Ch2.GuessingGame;

import java.util.Scanner;

public class Player {
    private final static Scanner scanner = new Scanner(System.in);
    private int number;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public int guess(){
        System.out.println(this.name + " your turn - enter number");
        number = scanner.nextInt();
        return number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
