package com.buckshot;

public class Knife extends GunItem{
    public Knife(Gun gun) {
        super(gun);
    }

    @Override
    public void use(){
        doubleDamage();
    }

    private void doubleDamage(){
        return;
    }
}
