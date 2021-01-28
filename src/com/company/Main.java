package com.company;

public class Main {

    public static void main(String[] args) {
         Game game = new Game();
        Player player = new Player("Hero",200);
        game.addPlayers();
        game.runMenu();

    }
}


