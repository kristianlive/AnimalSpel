package com.company;
import java.util.*;
public class Game {

    Scanner inputRound = new Scanner(System.in);

    public int rounds = 1;
    public int numOfRounds;

    public LinkedList<Player> players = new LinkedList<>();


    public void runMenu() {

        System.out.println("Please choice how many rounds you going to play." +
                "\nEnter number between 5-30 ");
        numOfRounds = inputRound.nextInt();
                System.out.println(this.numOfRounds + " rounds left.");
        System.out.println("------------------------------------------------");


        System.out.println("Please choice how many players. " +
                "\nEnter number between 1-4 ");
        Scanner inputPlayers = new Scanner(System.in);
        this.rounds = inputPlayers.nextInt();
        System.out.println("Your choice: " + this.rounds + " players, get Ready !");

        }
        public void runGame (){
        int i = 1;
        while (this.numOfRounds !=0) {
            System.out.println("Run game" + i++ );
            this.numOfRounds --;


    }
    }
    }