package com.buckshot.Items;

import com.buckshot.Core.User;

public class UserItem extends Item {
    User target;
    public UserItem(User target) {
        this.target = target;
    }
    public void useUser(User user){}
    public void describeUser(){}
    @Override
    public void use(){
        useUser(this.target);
        describeUser();
    }
}
