package com.company.Ch2.Shapes;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    public static Shape run(){
        System.out.println("Enter number of Angles");
        int D = scanner.nextInt();
        Shape ob;

        switch (D){
            case 3-> ob = new Triangle();
            case 4 ->ob = new Square();
            case 0 ->ob = new Circle();
            default -> ob = new Amoeba();
        }
        return ob;
    }
    public static void main(String...args){
        Shape ob = run();
        ob.singing();
        ob.rotate();
    }
}
