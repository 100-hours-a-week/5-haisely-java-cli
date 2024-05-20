package com.buckshot.Items;

import com.buckshot.Core.Gun;

public class Beer extends GunItem {
    public Beer(Gun gun) {
        super(gun);
        this.name = "맥주  ";
    }

    @Override
    public void use(){
        dumpBullet();
    }

    public void dumpBullet(){
        int b = gun.removeBullet();
        if (b!=0){
            System.out.println("실탄이 제거되었습니다.\n");
        } else {
            System.out.println("공포탄이 제거되었습니다\n");
        }
    }
}
