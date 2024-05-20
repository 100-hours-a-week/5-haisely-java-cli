package com.buckshot.Items;

import com.buckshot.Core.User;

public class Handcuff extends UserItem {
    public Handcuff(User target) {
        super(target);
        this.name = "수갑  ";
    }

    @Override
    public void use(){
        lockUser();
    }

    public void lockUser(){
        target.setFree(false);
        System.out.println(target.getName()+"가 수갑에 묶였습니다!\n");
        return;
    }
}
