package com.buckshot;

public class Main {
    public static void main(String[] args) {
        System.out.println(AsciiArt.start);
        User player1 = new User();
        User player2 = new User();
        Gun gun = new Gun();
        GameManager gm = new GameManager(player1, player2, gun);
        gm.initGame();

        while (gm.canRound()){
            gm.initRound();
            while(gm.canTurn()) {
                if (player1.getMyTurn()) { player1.myTurn();}
                if (gm.canTurn()) break;
                AsciiArt.printState(gm); player2.myTurn();
            }
        }
        gm.endGame();
    }
}
