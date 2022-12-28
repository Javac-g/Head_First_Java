package com.company.Ch5;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private String name;

    private List<String> coords = new ArrayList<>();

    public List<String> getCoords() {
        return coords;
    }

    public Ship(String name) {
        this.name = name;
    }

    public void setLocation(String x, String y, String z) {
        coords.add(x);
        coords.add(y);
        coords.add(z);
    }
    public void deleteLocation(String coord){
        int index = -1;
        for (int  i = 0; i < coords.size();i++){
            if (coords.get(i).equals(coord) ){
                index = i;
            }
        }
        if (index != -1){
            coords.remove(index);
        }
    }


}
