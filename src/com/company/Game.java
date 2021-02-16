package com.company;
import com.company.AnimalType.Animal;

import java.util.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable {

    private int numOfRounds;
    private int round = 1;
    protected Player currentPlayer;
    protected int amountPlayer;
    protected int menuChoice;
    Store store = new Store();

    Scanner scanAmountPlayer = new Scanner(System.in);
    Scanner scanPlayerName = new Scanner(System.in);
    Scanner scanMenuChoice = new Scanner(System.in);

    private ArrayList<Player> playerList = new ArrayList<Player>();

    public void getPlayerList() {
        for (int i = 0; i < playerList.size(); i++) {
            System.out.println(playerList.get(i).getName() + " ");
        }
    }


    public int getRound() {
        return this.round;
    }
    public void addPlayers (){
        this.amountPlayer = Dialogs.promptInt("Please enter the number of players:" +
                "\nEnter number between 1-4 ", 1, 4);
        while (amountPlayer != 0) {
            if (amountPlayer >= 1 && amountPlayer <= 4) {
                String inputName = Dialogs.prompt("Please enter the name of player number " + amountPlayer);
                Player player = new Player(inputName);
                playerList.add(player);
                amountPlayer--;
            } else {
                System.out.println("Error...Please choice how many players you are, between '1-4'");
            }
        }
    }
    public Game() {
        {
            round = Dialogs.promptInt("Please choice how many rounds you going to play." +
                    "\nEnter number between 5-30 ", 5, 30);
            numOfRounds = round;
            System.out.println(round + " rounds left.");
            System.out.println("------------------------------------------------");
        } addPlayers();
        System.out.println("Here is amount of players: " + "[" + playerList.size() + "]");
        for (var i = 1; i <= round; i++) {
            for (var player : playerList) {
                System.out.println(player.getName());
                runMenu();
            }
        }
    }
    public void runMenu() {
        int i = 1;
            if (numOfRounds > 0 && numOfRounds < 30) {
                System.out.println("Run game " + round++);

                menuChoice = Dialogs.menu("Player's personal menu", "Buy Animal",
                        "Sell Animal", "Buy Food", "Feed Animal", "Try to mate Animal","Pass round", "Exit");
                switch (menuChoice) {
                    //Create menu by methods
                     case 1 -> store.buyAnimal();
                    //case 2 -> store.sellAnimal;
                    //case 3-> store.buyFood;
                    //case 4-> store.feedAnimal;
                    //case 5 -> store.mateAnimals;
                    case 6 -> { break; }
                    case 7 ->System.exit(0);
                }
            } else {
                Dialogs.promptInt("Error...Please choice how many rounds you going to play." +
                        "\nEnter number between 5-30 ", 5, 30);
            }

        }

        public void checkIfPlayerHasEnoughCash(Player player, Animal newAnimal) {
        if (player.getMoney() >= newAnimal.getPrice()) {
            player.getPlayerAnimal().add(newAnimal);
            System.out.println("Yey! You bought a new animal!");
        } else {
            System.out.println("Oh no! You do not have enough money to buy this animal.");
        }

}}




