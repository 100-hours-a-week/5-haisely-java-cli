package com.buckshot.Items;

import com.buckshot.Core.Gun;

public class Knife extends GunItem {
    private int damage;
    public Knife(Gun gun) {
        super(gun);
        this.name = "식칼  ";
        this.description = "총의 데미지를 변경합니다.";
        this.damage = 2;
    }

    @Override
    public void use(){
        doubleDamage();
    }

    private void doubleDamage(){
        gun.setBulletDamage(2);
        System.out.println("장착된 총알의 데미지가 2가 되었습니다!\n");
    }
}
