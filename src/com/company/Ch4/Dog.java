package com.company.Ch4;

public class Dog {

    private final String name;
    private final int size;

    public Dog(int size,String name) {
        this.name = name;
        this.size = size;
    }
    public void process(String bark,int number){

        while (number-- > 0){
            System.out.println(this.name + bark);
        }

    }
    public void bark(int number){

        if(size > 60){
            process(": Woof",number);
        } else if (size > 14) {
            process(": Ruff",number);
        }else {
            process(": Yip Yip",number);
        }
    }

}
