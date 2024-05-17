package com.buckshot;

public class Knife extends GunItem{
    public Knife(Gun gun) {
        super(gun);
        this.name = "칼";
    }

    @Override
    public void use(){
        doubleDamage();
    }

    private void doubleDamage(){
        return;
    }
}
