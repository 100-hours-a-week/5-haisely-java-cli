package com.buckshot.Items;

public class Item {
    String name;
    String description;
    public void use(){
        decribeItem();
    }

    public String getName() {
        return name;
    }
    public void decribeItem() {
        System.out.println(this.name + " 설명 : "+this.description);
    }
}
