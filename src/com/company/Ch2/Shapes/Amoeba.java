package com.company.Ch2.Shapes;

public class Amoeba extends Shape{
    private int x, y;
    @Override
    public void rotate() {
        System.out.println("Rotated 360 degrees on center coords : " + x + y);
    }

    @Override
    public void singing() {
        System.out.println("Playing amoeba.mp3");
    }
}
