package com.buckshot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameManager {
    private final User p1;
    private final User p2;
    private final Gun gun;

    public GameManager(User p1, User p2, Gun gun) {
        this.p1 = p1;
        this.p2 = p2;
        this.gun = gun;
    }

    public void randomBullets(Gun gun){
        ArrayList<Integer> newBullets = new ArrayList<Integer>();
        int num = 3+(int)(Math.random()*6);
        int limit = (int)(num/3);
        int real = limit + (int)(Math.random()*(num-2*limit+1));

        for (int i = 0; i<num; i++){
            if(i<real){
                newBullets.add(1);
            }else{
                newBullets.add(0);
            }
        }
        Collections.shuffle(newBullets);
        gun.setBullets(newBullets);
        return;
    }

    public void randomItems(User user){
        ArrayList<Item> newItems = new ArrayList<Item>();
        for (int i = 0; i<4 ; i++){
            int randNum = (int)(Math.random()*5);
            switch (randNum){
                case 0:
                    newItems.add(new Beer(this.gun));
                    break;
                case 1:
                    newItems.add(new Cigarette(user));
                    break;
                case 2:
                    newItems.add(new Handcuff(user.getEnemy()));
                    break;
                case 3:
                    newItems.add(new Knife(this.gun));
                    break;
                case 4:
                    newItems.add(new Magnifier(this.gun));
                    break;
                default:
                    break;
            }
        }
        user.setItems(newItems);
        return;
    }

    public void initGame(){
        return;
    }

    public void initRound(){

    }
}
