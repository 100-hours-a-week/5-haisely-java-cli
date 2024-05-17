package com.buckshot;

public class Beer extends GunItem{
    public Beer(Gun gun) {
        super(gun);
        this.name = "맥주";
    }

    @Override
    public void use(){
        dumpBullet();
    }

    public void dumpBullet(){
        return;
    }
}
