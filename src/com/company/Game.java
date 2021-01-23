package com.company;
import java.util.*;
public class Game {

    Scanner inputRound = new Scanner(System.in);

    int rounds = 1;
    int numOfRounds = inputRound.nextInt();

    public LinkedList<Player> players = new LinkedList<>();


    public void runMenu() {

        while (rounds < numOfRounds) {
            System.out.println(this.numOfRounds + " rounds left.");
            System.out.println("------------------------------------------------");
        }

            System.out.println("Please choice how many players. " +
                    "\nEnter number between 1-4 ");
            Scanner inputPlayers = new Scanner(System.in);
            this.rounds = inputPlayers.nextInt();
            System.out.println("Your choice: " + this.rounds + " players, get Ready !");

        }
    }
