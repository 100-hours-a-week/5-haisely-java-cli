package com.buckshot;


import java.util.ArrayList;

public class Gun {
    private ArrayList<Integer> bullets = new ArrayList<Integer>();

    public void shoot(User target){
        int b = bullets.remove(0);
        if (b!=0){
            System.out.println("탕!!!!!");
            target.changeHealth(-b);
        } else {
            System.out.println("틱...");
        }
        return;
    }

    public void removeBullet(){
        int b = bullets.remove(0);
        if (b!=0){
            System.out.println("실탄이 제거되었습니다.");
        } else {
            System.out.println("공포탄이 제거되었습니다.");
        }
        return;
    }

    public Boolean isReal() {
        return bullets.get(0)!=0;
    }

    public Boolean isReal(int num){
        if (bullets.size() < num){
            return false;
        }
        return bullets.get(num)!=0;
    }

    public Boolean isEmptyBullet(){
        return bullets.isEmpty();
    }

    public void setBulletDamage(int damage){
        bullets.set(0, damage);
        return;
    }

    public ArrayList<Integer> getBullets() {
        return bullets;
    }

    public void setBullets(ArrayList<Integer> bullets) {
        this.bullets = bullets;
    }
}
