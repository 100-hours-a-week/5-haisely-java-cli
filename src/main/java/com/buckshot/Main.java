package com.buckshot;

public class Main {
    public static void main(String[] args) {
        System.out.println(AsciiArt.start);
        User player1 = new User();
        User player2 = new User();
        Gun gun = new Gun();
        GameManager gm = new GameManager(player1, player2, gun);
        gm.initGame();

        while (player1.getHealth()>0 && player2.getHealth()>0){
            gm.initRound();
            while(!gun.isEmptyBullet() && player1.getHealth()>0 && player2.getHealth()>0) {
                player1.myTurn();
                if (player1.getHealth()<=0 && player2.getHealth()<=0) break;
                player2.myTurn();
            }
        }

        gm.endGame();
    }
}
