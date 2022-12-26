package com.company.Ch2;

public class Triangle extends Shape{
    @Override
    public void rotate() {
        System.out.println("Rotated 360 degrees");
    }

    @Override
    public void singing() {
        System.out.println("Playing triangle.mp3");
    }
}
