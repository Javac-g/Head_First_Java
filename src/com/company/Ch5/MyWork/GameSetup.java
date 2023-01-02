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
        coords.add("D");
        coords.add("E");
        coords.add("F");
        coords.add("G");
        System.out.println(coords);
        Ship s1 = new Ship("Mariner");
        Ship s2 = new Ship("Interceptor");
        Ship s3 = new Ship("Flagman");

        setShipsCoords(s1);
        setShipsCoords(s2);
        setShipsCoords(s3);

        battleField.add(s1);
        battleField.add(s2);
        battleField.add(s3);
        System.out.println("Battlefield: " + battleField.size());

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
//    public void highVertical(int x, int word){
//        if (word >= 5) {
//            String cx = coords.get(word);
//            String cy = coords.get(word - 1);
//            String cz = coords.get(word - 2);
//
//            setCoordY(coords.get(word - 1) + x);
//            coords.remove(cy);
//
//            setCoordZ(coords.get(word - 2) + x);
//            coords.remove(cz);
//
//            coords.remove(cx);
//        }else {
//            String cx = coords.get(word);
//            String cy = coords.get(word + 1);
//            String cz = coords.get(word + 2);
//
//            setCoordY(coords.get(word + 1) + x);
//            coords.remove(cy);
//
//            setCoordZ(coords.get(word + 2) + x);
//            coords.remove(cz);
//
//            coords.remove(cx);
//
//        }
//    }

    public void highHorizon(int x, int word){

        if (x >= 5){
            setCoordY(coords.get(word) + (x - 1));
            setCoordZ(coords.get(word) + (x - 2));
            coords.remove(word);
        }else {
            setCoordY(coords.get(word) + (x + 1));
            setCoordZ(coords.get(word) + (x + 2));
            coords.remove(word);
        }


    }


    public void setShipsCoords(Ship s){

        Random r = new Random();

        x = r.nextInt(7);
        System.out.println("x: " + x);
        word = r.nextInt(coords.size());
        System.out.println("word: " + coords.get(word));
        String coordX = coords.get(word) + x;

        System.out.println(coords);

        Random choose = new Random();
        int ch = choose.nextInt(3);



        highHorizon(x,word);







        s.setLocation(coordX,coordY,coordZ);

    }
    public void test(Ship s){
        for (int i = 0; i < s.getCoords().size();i++){
            System.out.print(s.getCoords().get(i) + " ");
        }
    }
}
