package com.buckshot;

public class Magnifier extends GunItem{
    public Magnifier(Gun gun) {
        super(gun);
        this.name = "돋보기";
    }

    @Override
    public void use(){
        checkReal();
    }

    public void checkReal(){
        return;
    }

}
