package com.company.Ch5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GameSetup {
    private final List<Ship> battleField = new ArrayList<>();
    private List<String> coords =new ArrayList();

    public GameSetup() {
        coords.add("A");
        coords.add("B");
        coords.add("C");
        coords.add("E");
        coords.add("F");
        coords.add("G");

        Ship s1 = new Ship("Mariner");
        Ship s2 = new Ship("Interceptor");
        Ship s3 = new Ship("Flagman");

        setShipsCoords(s1);
        setShipsCoords(s2);
        setShipsCoords(s3);

        battleField.add(s1);
        battleField.add(s2);
        battleField.add(s3);

        test(s1);
        test(s2);
        test(s3);
    }

    public List<Ship> getBattleField() {
        return battleField;
    }


    public void setShipsCoords(Ship s){

        Random r = new Random();
        String cx;

        int x,y,z;

        x = r.nextInt(coords.size());

        cx = coords.get(x) + x;

        System.out.println(coords);
        String cy = "";
        String cz = "";


        if(x >= 5){
            y = x-1;
            cy = coords.get(x) + y ;
            z = y-1;
            cz = coords.get(x) + z ;
        } else {
            y = x + 1;
            z = y + 1;
            cy = coords.get(x) + y ;
            cz = coords.get(x) + z ;
        }
        coords.remove(x);





        s.setLocation(cx,cy,cz);

    }
    public void test(Ship s){
        for (int i = 0; i < s.getCoords().size();i++){
            System.out.print(s.getCoords().get(i) + " ");
        }
    }
}
