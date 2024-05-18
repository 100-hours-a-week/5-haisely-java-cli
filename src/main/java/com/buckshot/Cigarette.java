package com.buckshot;

public class Cigarette extends UserItem{
    public Cigarette(User target) {
        super(target);
        this.name = "담배  ";
    }

    @Override
    public void use(){
        incHealth();
    }

    public void incHealth(){
        target.changeHealth(1);
        System.out.println(target.getName()+"의 체력이 1 회복되었습니다!");
        return;
    }
}
