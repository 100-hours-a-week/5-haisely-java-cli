package com.buckshot;

public class Main {
    public static void main(String[] args) {
        System.out.println(AsciiArt.start);
        User player1 = new User();
        User player2 = new User();
        Gun gun = new Gun();
        GameManager gm = new GameManager(player1, player2, gun);
        gm.initGame();
    }
}
