package com.buckshot.Items;

import com.buckshot.Core.User;

public class Handcuff extends UserItem {
    private String name;
    public Handcuff(User target) {
        super(target);
        this.name = "수갑  ";
        this.description = "상대방이 다음턴을 못하도록 막습니다.";
    }

    @Override
    public void useUser(User user){
        lockUser(user);
    }

    @Override
    public void describeUser(){
        System.out.println(this.name+"가 수갑에 묶였습니다!\n");
    }

    public void lockUser(User user){
        user.setFree(false);
        this.name = user.getName();
    }

}
