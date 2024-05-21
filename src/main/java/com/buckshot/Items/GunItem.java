package com.buckshot.Items;

import com.buckshot.Core.Gun;

public class GunItem extends Item{
    Gun gun;
    public GunItem(Gun gun) {
        this.gun = gun;
    }
    public void useGun(Gun gun) { }
    public void describeGun(){}
    @Override
    public void use(){
        useGun(this.gun);
        describeGun();
    }
}
