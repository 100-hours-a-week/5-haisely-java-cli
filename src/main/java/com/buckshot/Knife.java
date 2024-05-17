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
        gun.setBulletDamage(2);
        System.out.println("장착된 총알의 데미지가 2가 되었습니다!");
    }
}
