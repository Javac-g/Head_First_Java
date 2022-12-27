package com.company.Ch3;

public class Dog {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void bark(){
        System.out.println("Bark bark");
    }
    public static void main(String...args){
        Dog dog1 = new Dog();

        dog1.setName("Bart");
        dog1.bark();

        Dog[] myDogs = new Dog[5];

        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = new Dog();
        myDogs[3] = dog1;

        myDogs[0].setName("Fred");
        myDogs[1].setName("Marge");
        myDogs[2].setName("Den");
        myDogs[3].setName("Jhonn");

        System.out.println("Last dog name is: " + myDogs[3].getName());
        int x = 0;
        while (x < myDogs.length){
            System.out.println(myDogs[x].getName());
            myDogs[x].bark();
            x+=1;
        }


    }
}
