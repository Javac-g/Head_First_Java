package com.company.Ch5;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameSetup {
    private final List<Ship> battleField = new ArrayList<>();
    private final String[] coords = {"A","B","C","D","E","F","G"};

    public GameSetup() {
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

        x = r.nextInt(0,7);
        cx = coords[x] + x;
        String cy = "";
        String cz = "";


        if(x >= 5){
            y = x-1;
            cy =coords[x] + y ;
            z = y-1;
            cz = coords[x] + z ;
        } else {
            y = x + 1;
            z = y + 1;
            cy = coords[x] + y ;
            cz = coords[x] + z ;
        }






        s.setLocation(cx,cy,cz);

    }
    public void test(Ship s){
        for (int i = 0; i < s.getCoords().size();i++){
            System.out.print(s.getCoords().get(i) + " ");
        }
    }
}
