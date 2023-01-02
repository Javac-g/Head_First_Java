package com.company.Ch5.ChapterExample;

import java.util.Scanner;

public class ViewHelper {
    private final static Scanner scanner = new Scanner(System.in);

    public int getUserInput(String msg){
        System.out.println(msg);
        return scanner.nextInt();
    }
}
