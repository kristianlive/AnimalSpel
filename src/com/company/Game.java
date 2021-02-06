package com.company;
import java.util.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
public class Game implements Serializable {

    public int numOfRounds;
    protected Player currentPlayer;
    protected int amountPlayer;

    Scanner scanAmountPlayer = new Scanner(System.in);
    Scanner scanPlayerName = new Scanner(System.in);

    private ArrayList<Player> playerList = new ArrayList<Player>();


    public void getPlayerList() {
        for (int i = 0; i < playerList.size(); i++) {
            System.out.println(playerList.get(i).getName() + " ");
        }
    }
    public Game() {
        { this.amountPlayer = Dialogs.promptInt("Please enter the number of players:" +
                    "\nEnter number between 1-4 ", 1,4);
        } while (amountPlayer !=0) {
            if (amountPlayer >= 1 && amountPlayer <= 4) {
                System.out.println("Please enter the name of player number " + amountPlayer);
                String inputName = scanPlayerName.nextLine();
                Player player = new Player(inputName);
                playerList.add(player);
                amountPlayer --;
            } else { System.out.println("Error...Please choice how many players you are, between '1-4'");
            } }System.out.println("Here is amount of players: " + "[" + playerList.size() + "]");
        getPlayerList(); }

            public void runMenu () {
            int rounds = Dialogs.promptInt("Please choice how many rounds you going to play." +
                    "\nEnter number between 5-30 ", 5, 30);
            System.out.println(rounds + " rounds left.");
            System.out.println("------------------------------------------------");
            int i = 1;
            while (rounds != 0) {
                if (rounds > 0 && rounds < 30) {
                    System.out.println("Run game " + i++);

                Dialogs.menu("Player's personal menu", "Buy Animal",
                            "Buy Food","Feed Animal","Try to mate animals");

                    rounds--;
                } else {
                    Dialogs.promptInt("Error...Please choice how many rounds you going to play." +
                            "\nEnter number between 5-30 ", 5, 30);
                }

            }
        }
        }





