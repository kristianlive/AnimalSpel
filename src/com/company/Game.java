package com.company;
import java.util.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable {

    public int numOfRounds;
    public Player currentPlayer;
    private ArrayList<Player> playerList = new ArrayList<Player>();

    public Game() {
        Player player1 = new Player("Joe", 200);
        Player player2 = new Player("Filip", 200);
        Player player3 = new Player("Max", 200);
        Player player4 = new Player("Dude", 200);
        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);
        playerList.add(player4);
    }
    public Player getPlayer(String playerName) {
        Player player = null;

        for (Player everyPlayer : playerList) {
            if (everyPlayer.getName().equals(playerName)) {
                player = everyPlayer;
            } }
        return player; }

    public void addPlayers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of players:" +
                "\nEnter number between 1-4 ");
        int amountPlayer = scanner.nextInt();

        String[] player_name = new String[amountPlayer + 1];
        for (int i = 0; i < amountPlayer; i++) {
            System.out.print("Player " + (i + 1) + " please enter your name:\n");
            player_name[i] = scanner.nextLine();

            System.out.println(player_name[0]);
        }
        }

    public void runMenu() {
        int rounds = Dialogs.promptInt("Please choice how many rounds you going to play." +
                "\nEnter number between 5-30 ", 5, 30);
        System.out.println(rounds + " rounds left.");
        System.out.println("------------------------------------------------");

        int i = 1;
        while (rounds != 0) {
            if (rounds > 0 && rounds < 30) {
                System.out.println("Run game " + i++);
                rounds--;
            } else {
               Dialogs.promptInt("Error...Please choice how many rounds you going to play." +
                        "\nEnter number between 5-30 ", 5, 30);
            }

        }
    }

}



