package com.buckshot;


import java.util.ArrayList;

public class Gun {
    private ArrayList<Boolean> bullets = new ArrayList<Boolean>();
    private int damage = 1;

    public void shoot(User target){
        Boolean b = bullets.remove(0);
        if (b){
            System.out.println("탕!!!!!");
            target.changeHealth(-damage);
        } else {
            System.out.println("틱...");
        }
        return;
    }

    public void removeBullet(){
        Boolean b = bullets.remove(0);
        if (b){
            System.out.println("실탄이 제거되었습니다.");
        } else {
            System.out.println("공포탄이 제거되었습니다.");
        }
        return;
    }

    public Boolean isReal() {
        return bullets.get(0);
    }

    public Boolean isReal(int num){
        if (bullets.size() < num){
            return false;
        }
        return bullets.get(num);
    }

    public Boolean isEmptyBullet(){
        return bullets.isEmpty();
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
