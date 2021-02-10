package com.company;
import java.util.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
public class Game implements Serializable {

    Store store = new Store();

    private int numOfRounds;
    private int round = 1;
    protected Player currentPlayer;
    protected int amountPlayer;
    protected int menuChoice;

    Scanner scanAmountPlayer = new Scanner(System.in);
    Scanner scanPlayerName = new Scanner(System.in);
    Scanner scanMenuChoice = new Scanner(System.in);

    private ArrayList<Player> playerList = new ArrayList<Player>();


    public void getPlayerList() {
        for (int i = 0; i < playerList.size(); i++) {
            System.out.println(playerList.get(i).getName() + " ");
        } }
        public int getRound(){
            return this.round; }

    public Game() {
        {
            this.amountPlayer = Dialogs.promptInt("Please enter the number of players:" +
                    "\nEnter number between 1-4 ", 1, 4);
        }
        while (amountPlayer != 0) {
            if (amountPlayer >= 1 && amountPlayer <= 4) {
                System.out.println("Please enter the name of player number " + amountPlayer);
                String inputName = scanPlayerName.nextLine();
                Player player = new Player(inputName);
                playerList.add(player);
                amountPlayer--;
            } else {
                System.out.println("Error...Please choice how many players you are, between '1-4'");
            }
        }
        System.out.println("Here is amount of players: " + "[" + playerList.size() + "]");
        getPlayerList();
    }

    public void runMenu() {
        round = Dialogs.promptInt("Please choice how many rounds you going to play." +
                "\nEnter number between 5-30 ", 5, 30);
        System.out.println(round + " rounds left.");
        System.out.println("------------------------------------------------");
        int i = 1;
        while (round != 0) {
            if (round > 0 && round < 30) {
                System.out.println("Run game " + i++);

                menuChoice = Dialogs.menu("Player's personal menu", "Buy Animal",
                        "Sell Animal", "Buy Food", "Feed Animal", "Try to mate Animal","Pass round", "Exit");
                switch (menuChoice) {
                    //Create menu by methods
                     case 1 -> store.buyAnimal();
                    //case 2 -> store.sellAnimal;
                    //case 3-> store.buyFood;
                    //case 4-> store.feedAnimal;
                    //case 5 -> store.mateAnimals;
                    case 6 -> round --;
                    case 7 ->System.exit(0);
                }
            } else {
                Dialogs.promptInt("Error...Please choice how many rounds you going to play." +
                        "\nEnter number between 5-30 ", 5, 30);
            }

        }

        }
    }







