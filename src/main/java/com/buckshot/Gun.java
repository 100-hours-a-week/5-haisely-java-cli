package com.buckshot;


import java.util.ArrayList;

public class Gun {
    private ArrayList<Integer> bullets = new ArrayList<Integer>();

    public void shoot(User target){
        int b = bullets.removeFirst();
        AsciiArt.printDot();
        if (b!=0){
            AsciiArt.printBang();
            target.changeHealth(-b);
        } else {
            AsciiArt.printCenteredString("틱...\n", 0, 1000);
        }
        return;
    }

    public int removeBullet(){
        return bullets.removeFirst();
    }

    public Boolean isReal() {
        return bullets.getFirst()!=0;
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
