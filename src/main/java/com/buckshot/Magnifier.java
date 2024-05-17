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
        int b = gun.removeBullet();
        if (b!=0){
            System.out.println("실탄이 제거되었습니다.");
        } else {
            System.out.println("공포탄이 제거되었습니다.");
        }
    }

}
