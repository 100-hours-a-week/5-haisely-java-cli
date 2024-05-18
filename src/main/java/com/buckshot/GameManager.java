package com.buckshot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GameManager {
    private final User p1;
    private final User p2;
    private final Gun gun;
    private int round = 1;
    private static final Scanner scanner = new Scanner(System.in);

    public GameManager(User p1, User p2, Gun gun) {
        this.p1 = p1;
        this.p2 = p2;
        this.gun = gun;
        this.p1.setGun(gun);
        this.p2.setGun(gun);
        this.p1.setScanner(this.scanner);
        this.p2.setScanner(this.scanner);
        this.p1.setEnemy(p2);
        this.p2.setEnemy(p1);
    }

    public void randomBullets(Gun gun){
        ArrayList<Integer> newBullets = new ArrayList<Integer>();
        int num = 3+(int)(Math.random()*6);
        int limit = (int)(num/3);
        int real = limit + (int)(Math.random()*(num-2*limit+1));
        AsciiArt.printCenteredStringPretty("총알이 "+num+" 개 장전됩니다.");

        for (int i = 0; i<num; i++){
            if(i<real){
                newBullets.add(1);
            }else{
                newBullets.add(0);
            }
            AsciiArt.printCenteredString("찰칵\n", 0);
        }
        AsciiArt.printCenteredStringPretty("실탄 "+real+" 개, 공포탄 "+ (num-real)+"개가 장전되었습니다.");
        Collections.shuffle(newBullets);
        gun.setBullets(newBullets);
        return;
    }

    public void randomItems(User user){
        ArrayList<Item> newItems = new ArrayList<Item>();
        for (int i = 0; i<4 ; i++){
            int randNum = (int)(Math.random()*5);
            switch (randNum){
                case 0:
                    newItems.add(new Beer(this.gun));
                    break;
                case 1:
                    newItems.add(new Cigarette(user));
                    break;
                case 2:
                    newItems.add(new Handcuff(user.getEnemy()));
                    break;
                case 3:
                    newItems.add(new Knife(this.gun));
                    break;
                case 4:
                    newItems.add(new Magnifier(this.gun));
                    break;
                default:
                    break;
            }
        }
        user.setItems(newItems);
        return;
    }

    public void initGame(){
        // 메시지 출력
        AsciiArt.printCenteredStringPretty("Player 1의 이름을 작성하세요.");
        AsciiArt.printCenteredString("   >  ", 8);
        String playerName1 = scanner.nextLine();
        p1.setName(playerName1);
        AsciiArt.printCenteredStringPretty("Player 1: " + playerName1);

        AsciiArt.printCenteredStringPretty("Player 2의 이름을 작성하세요.");
        AsciiArt.printCenteredString("   >  ", 8);
        String playerName2 = scanner.nextLine();
        p2.setName(playerName2);
        AsciiArt.printCenteredStringPretty("Player 2: " + playerName2);
        return;
    }

    public void initRound(){
        AsciiArt.printCenteredStringPretty(this.round + " Round가 시작됩니다.");
        randomBullets(this.gun);
        randomItems(this.p1);
        randomItems(this.p2);
    }

    public void endGame(){
        scanner.close();
    }
}
