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
            AsciiArt.printState(player1, player2);
            while(!gun.isEmptyBullet() && player1.getHealth()>0 && player2.getHealth()>0) {
                if (player1.getMyTurn()) {player1.myTurn();}
                AsciiArt.printState(player1, player2);
                if (player1.getHealth()<=0 && player2.getHealth()<=0) break;
                player2.myTurn();
                AsciiArt.printState(player1, player2);
            }
        }

        gm.endGame();
    }
}
