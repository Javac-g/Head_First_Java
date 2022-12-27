package com.company.Ch4;

public class Main {
    public static void main(String...args){
        Dog d1 = new Dog(12,"Small");
        Dog d3 = new Dog(15,"Middle");
        Dog d2 = new Dog(61,"Big");

        d1.bark(3);
        d2.bark(2);
        d3.bark(1);
    }
}
