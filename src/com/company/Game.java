package com.company;
import java.util.*;
public class Game {

    int rounds;
    int players;

    public void getRounds () {
        System.out.println("Please choice how many rounds you going to play." +
                "\nEnter number between 5-30 ");
        Scanner inputRound = new Scanner(System.in);
        this.rounds = inputRound.nextInt();
        System.out.println("You going to play " + this.rounds + "th rounds.");
        System.out.println("------------------------------------------------");

    }

    public void getPlayers () {
        System.out.println("Please choice how many players. " +
                "\nEnter number between 1-4 ");
        Scanner inputPlayers = new Scanner(System.in);
        this.rounds = inputPlayers.nextInt();
        System.out.println("Your choice: " + this.rounds + " players, get Ready !");
    }
}
