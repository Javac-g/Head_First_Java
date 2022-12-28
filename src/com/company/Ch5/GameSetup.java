package com.company.Ch5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameSetup {
    private char[] coords ={'A','B','C','D','E','F','G'};
    private Ship s1,s2,s3;

    public GameSetup() {
        s1 = new Ship("Mariner");
        s2 = new Ship("Interceptor");
        s3 = new Ship("Flagman");

        setShipsCoords(s1);
        setShipsCoords(s2);
        setShipsCoords(s3);
        test(s1);
        test(s2);
        test(s3);
    }


    public void setShipsCoords(Ship s){
        Random r = new Random();
        String cx = "";
        String cy = "";
        String cz = "";
        int x = 0;
        int y = 0;
        int z = 0;

        x = r.nextInt(7);
        cx = coords[x] + x + "";

        if(coords[x] == 'G'){
            if(x == 7){
                y = x-1;
                cy = String.valueOf(coords[x]) + y + "";
                z = y-1;
                cz = coords[x] + z + "";
            } else if (x <= 4) {
                y = x + 1;
                z = y + 1;
                cy = coords[x] + y + "";
                cz = coords[x] + z + "";
            }

        }

        else if(x == 7){
            y = x+7;
            cy = coords[x] + y + "";
            z = y+ 7;
            cz = coords[x] + z + "";
        } else if (x <= 4) {
            y = x + 1;
            z = y + 1;
            cy = coords[x] + y + "";
            cz = coords[x] + z + "";
        }

        s.setLocation(cx,cy,cz);

    }
    public void test(Ship s){
        for (int i = 0; i < s.getCoords().size();i++){
            System.out.print(s.getCoords().get(i) + " ");
        }
    }
}
