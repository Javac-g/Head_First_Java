package com.company.Ch1;

import java.util.Scanner;

public class UsbFlashDrive {
    private static int memory = 1024;
    private static String verb = "bytes";

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String...args){
        while (memory > 0) {
            if (String.valueOf(memory).endsWith("1")) {

                verb = "byte";
            }
            verb = "bytes";
            System.out.println("Enter data to write:");
            String n = scanner.next();

            memory -= n.length();

            if(memory > 0){
                System.out.println("Memory left - " + memory + " " + verb);
            }else {
                System.out.println("No Memory Left");
            }
        }

    }
}
