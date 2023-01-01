package com.company.Ch5.MyWork;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private final String name;
    private Boolean alive;
    private  int life ;


    private final List<String> coords = new ArrayList<>();

    public Ship(String name) {
        this.alive = true;
        this.name = name;
        this.life = 3;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public List<String> getCoords() {
        return coords;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
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
