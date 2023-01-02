package com.company.Ch5.ChapterExample;

import java.util.ArrayList;
import java.util.List;

public class SimpleShip {
    private List<Integer> locationCells = new ArrayList<>();
    private  int hits = 0;

    public int getHits() {
        return hits;
    }

    public void setLocationCells(List<Integer> locationCells) {
        this.locationCells = locationCells;
    }
    public String checkYourself(int guess){
        String result = "miss";
        int index = -1;
        for (int i = 0;i < locationCells.size();i++){
            if (locationCells.get(i).equals(guess)){
                result = "hit";
                index = i;
                locationCells.remove(index);
                hits++;
                break;
            }
        }
        if (hits == 3){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
