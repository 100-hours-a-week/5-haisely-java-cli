package com.buckshot;

public class Handcuff extends UserItem{
    public Handcuff(User target) {
        super(target);
    }

    @Override
    public void use(){
        lockUser();
    }

    public void lockUser(){
        return;
    }
}
