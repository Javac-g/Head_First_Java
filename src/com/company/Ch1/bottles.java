package com.company.Ch1;

public class bottles {

    private static String word = "bottles";
    private static int num = 10;

    public static void main(String...args){
        while (num > 0){
            if (num == 1){
                word = "bottle";
            }
            System.out.println(num + " green " + word + " hanging on the wall");
            System.out.println(num + " green " + word + " hanging on the wall");
            System.out.println("If one drop and fall");
            num--;

            if (num > 0){
                System.out.println(num + " green " + word + " hanging on the wall");
            }else{
                System.out.println("there will be no green bottles hanging on the wall");
            }
        }
    }
}
