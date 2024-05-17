package com.buckshot;


import java.util.ArrayList;

public class Gun {
    private ArrayList<Boolean> bullets = new ArrayList<Boolean>();
    private int damage = 1;

    public void shoot(User target){
        return;
    }

    public void removeBullet(){
        return;
    }

    public Boolean isReal() {
        return true;
    }

    public Boolean isReal(int num){
        return true;
    }

    public ArrayList<Boolean> getBullets() {
        return bullets;
    }

    public void setBullets(ArrayList<Boolean> bullets) {
        this.bullets = bullets;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
