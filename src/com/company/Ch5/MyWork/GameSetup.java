package com.company.Ch5.MyWork;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameSetup {
    private final List<Ship> battleField = new ArrayList<>();
    private List<String> coords =new ArrayList();
    private int x,word;
    private String coordY;
    private String coordZ;

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





    public  void setCoordY(String coordY) {
        this.coordY = coordY;
    }


    public  void setCoordZ(String coordZ) {
        this.coordZ = coordZ;
    }

    public List<Ship> getBattleField() {
        return battleField;
    }
    public void highHorizont(int x,int word){

        int y = x-1;
        setCoordY(coords.get(word) + y);
        int z = y-1;
        setCoordZ(coords.get(word) + z);

    }
    public void lowHorizont(int x,int word){
        int y = x + 1;
        int z = y + 1;
        setCoordY(coords.get(word) + y);
        setCoordZ(coords.get(word) + z);
    }

    public void setShipsCoords(Ship s){

        Random r = new Random();

        x = r.nextInt(7);
        word = r.nextInt(coords.size());
        String coordX = coords.get(word) + x;

        System.out.println(coords);



        if(x >= 5){
            highHorizont(x,word);
        } else {
            lowHorizont(x,word);
        }
        coords.remove(word);





        s.setLocation(coordX,coordY,coordZ);

    }
    public void test(Ship s){
        for (int i = 0; i < s.getCoords().size();i++){
            System.out.print(s.getCoords().get(i) + " ");
        }
    }
}
