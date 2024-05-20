package com.buckshot;

import com.buckshot.Core.Gun;
import com.buckshot.Core.User;
import com.buckshot.Manager.AsciiArt;
import com.buckshot.Manager.GameManager;

public class Main {
    public static void main(String[] args) {
        System.out.println(AsciiArt.start);
        AsciiArt.sleepMillis(1000);
        User player1 = new User();
        User player2 = new User();
        Gun gun = new Gun();
        GameManager gm = new GameManager(player1, player2, gun);
        gm.initGame();

        while (gm.canRound()){
            gm.initRound();
            while(gm.canTurn()) {
                if (player1.getMyTurn()) { player1.myTurn();}
                if (!gm.canTurn()) break;
                player2.myTurn();
            }
        }
        gm.endGame();
    }
}
