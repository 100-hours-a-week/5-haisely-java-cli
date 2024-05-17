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
        if (gun.isReal()){
            System.out.println("실탄이 장착되어 있습니다.");
        } else {
            System.out.println("공포탄이 장착되어 있습니다.");
        }
    }
}
