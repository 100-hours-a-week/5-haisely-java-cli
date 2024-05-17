package com.buckshot;

public class Magnifier extends GunItem{
    public Magnifier(Gun gun) {
        super(gun);
    }

    @Override
    public void use(){
        checkReal();
    }

    public void checkReal(){
        return;
    }

}
