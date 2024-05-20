package com.buckshot.Items;

import com.buckshot.Core.User;

public class Cigarette extends UserItem {
    public Cigarette(User target) {
        super(target);
        this.name = "담배  ";
    }

    @Override
    public void use(){
        incHealth();
    }

    public void incHealth(){
        if (target.getHealth()<6) {
            target.changeHealth(1);
            System.out.println(target.getName() + "의 체력이 1 회복되었습니다!\n");
        } else {
            System.out.println(target.getName() + "의 체력이 최대여서 회복되지 않았습니다!\n");
        }
        return;
    }
}
