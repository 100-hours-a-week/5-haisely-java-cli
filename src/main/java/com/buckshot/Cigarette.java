package com.buckshot;

public class Cigarette extends UserItem{
    public Cigarette(User target) {
        super(target);
    }

    @Override
    public void use(){
        incHealth();
    }

    public void incHealth(){
        return;
    }
}
