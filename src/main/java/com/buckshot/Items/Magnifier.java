package com.buckshot.Items;

import com.buckshot.Core.Gun;

public class Magnifier extends GunItem {
    public Magnifier(Gun gun) {
        super(gun);
        this.name = "돋보기";
    }

    @Override
    public void use(){
        checkReal();
    }

    public void checkReal(){
        if (gun.isReal()){
            System.out.println("실탄이 장착되어 있습니다.\n");
        } else {
            System.out.println("공포탄이 장착되어 있습니다.\n");
        }
    }

}
