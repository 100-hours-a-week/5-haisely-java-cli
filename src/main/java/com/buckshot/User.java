package com.buckshot;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int health;
    private String name;
    private List<Item> items = new ArrayList<Item>();
    private Gun gun;
    private User enemy;
    private boolean isFree;

    public void useItem(Item item){
        return;
    }

    public void myTurn(){

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public User getEnemy() {
        return enemy;
    }

    public void setEnemy(User enemy) {
        this.enemy = enemy;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
