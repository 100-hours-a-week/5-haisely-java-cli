package com.buckshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private int health;
    private String name;
    private List<Item> items = new ArrayList<Item>();
    private Gun gun;
    private User enemy;
    private Boolean isFree;
    private Boolean myTurn;

    public void useItem(int index){
        Item i = items.get(index -1);
        System.out.println(this.name+"이 "+ i.getName()+"을 사용했습니다.");
        i.use();
        items.remove(index);
        return;
    }

    public void myTurn(){
        // 1. 아이템 사용 // 2. 나에게 쏘기 // 3. 적에게 쏘기
        System.out.println(this.name + "의 차례입니다.\n");

        if(!isFree){
            System.out.println(this.name + "이 수갑에 묶여있어 차례가 넘어갑니다.\n");
            setFree(true);
            return;
        }
        Scanner sc = new Scanner(System.in);

        while(myTurn && !gun.isEmptyBullet()){
            System.out.println("1. 아이템 사용 2. 나에게 쏘기 3. 적에게 쏘기\n");
            System.out.println("액션을 선택하세요 > ");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("아이템을 선택하세요 > ");
                    int itemIndex = sc.nextInt();
                    useItem(itemIndex);
                    break;
                case 2:
                    System.out.println(this.name +"가 자신에게 총을 쏩니다.");
                    gun.shoot(this);
                    break;
                case 3:
                    System.out.println(this.name +"이 "+ enemy.name+"에게 총을 쏩니다.");
                    gun.shoot(enemy);
                    setMyTurn(false);
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }

    private void printItem(){

    }

    public void changeHealth(int damage){
        this.health += damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public User getEnemy() {
        return enemy;
    }

    public void setEnemy(User enemy) {
        this.enemy = enemy;
    }

    public Boolean getFree() {
        return isFree;
    }

    public void setFree(Boolean free) {
        isFree = free;
    }

    public Boolean getMyTurn() {
        return myTurn;
    }

    public void setMyTurn(Boolean myTurn) {
        this.myTurn = myTurn;
    }
}
