package com.company;
import com.company.AnimalType.Animal;

import java.util.*;
import java.io.Serializable;
import java.util.ArrayList;

import com.company.FoodClasses.Feed;
import com.company.Player.*;
import com.company.Game.*;

public class Game implements Serializable {

    private int numOfRounds;
    private int displayRounds;
    private int round = 1;
    protected Player currentPlayer;
    protected int amountPlayer;
    protected int menuChoice;
    String inputName;
    Store store = new Store();
    Feed feed = new Feed();
     ArrayList<Player> playerList = new ArrayList<Player>();

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
        System.out.println("Your choice is: [" + amountPlayer + "] players");
        while (amountPlayer != 0) {
            if (amountPlayer >= 1 && amountPlayer <= 4) {
                this.inputName = Dialogs.prompt("Please enter the name of player number " + amountPlayer);
                Player player = new Player(this.inputName);
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
            this.displayRounds = round * 2;
            System.out.println("Yor choice is: [" + round + "] rounds for each player" );
            System.out.println("------------------------------------------------");
        } addPlayers();
       // System.out.println("Here is amount of players: " + "[" + playerList.size() + "]");
        System.out.println("------------------------------------------------");
        for (var i = 1; i <= round; i++) {
            for (var player : playerList) {
                System.out.println(">>>" + this.displayRounds-- + "<<< rounds left for both players");
                System.out.println("[" + player.getName() + "] It's your turn now!");
                for(Animal animal: player.playerAnimal){
                    animal.decreaseHealthAndAge();}
                runMenu(player);
            }
        }
    }
    public void runMenu(Player player) {
            if (numOfRounds > 0 && numOfRounds < 30) {

                menuChoice = Dialogs.menu("Please make choice", "Buy Animal",
                        "Sell Animal", "Buy Food", "Feed Animal", "Try to mate Animal","Pass round", "Exit");
                switch (menuChoice) {
                    //Create menu by methods
                     case 1 -> store.buyAnimal(player);
                    case 2 -> store.sellAnimal(player);
                    case 3-> store.buyFood(player);
                    case 4-> feed.feedAnimal(player);
                    case 5 -> store.mateAnimals;
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
            }


}





