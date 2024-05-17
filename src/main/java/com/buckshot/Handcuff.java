package com.buckshot;

public class Handcuff extends UserItem{
    public Handcuff(User target) {
        super(target);
        this.name = "수갑";
    }

    @Override
    public void use(){
        lockUser();
    }

    public void lockUser(){
        target.setFree(false);
        System.out.println(target.getName()+"이 수갑이 묶였습니다!");
        return;
    }
}
