package com.company.Ch5.ChapterExample;

public class SimpleShip {
    private int[] locationCells;
    private  int hits = 0;

    public int getHits() {
        return hits;
    }

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }
    public String checkYourself(int guess){
        String result = "miss";
        for (int cell:locationCells){
            if (guess == cell){
                result = "hit";
                hits++;
                break;
            }
        }
        if (hits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
