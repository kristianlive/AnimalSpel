package com.company;

import java.io.Serializable;
import java.util.*;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Serializable {
    public Game game;
    private String name; // set game and get name exist
    private int money;
    private ArrayList<Animal> playerAnimal;
    private ArrayList<Food> playerFood;
    public boolean canBuyAnimal = true;
    public boolean canSellAnimal = true;
    public boolean canBuyFood = true;
    public boolean canAnimal = true;
    public boolean canFeedAnimal = true;
    public boolean roundDone = false;

    //List<Player> player_name = new ArrayList<>();
    public ArrayList<Player> player_name;

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Player(String name, int money) {
        this.name = name;
        this.money = money;
        this.playerAnimal = new ArrayList();
        this.playerFood = new ArrayList();
    }


   /* public void setPlayers () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of players:" +
                "\nEnter number between 1-4 ");
        int amountPlayer = scanner.nextInt();

        if (amountPlayer == 1){
            player_name.add(1,"sdsd");
            System.out.println("Your choice is: " + amountPlayer + " player" +
                    "\nPlayer name: " + player_name);
    }
    else if (amountPlayer == 2){
            player_name.add("Killer");
            player_name.add("Richy");
            System.out.println("Your choice is: " + amountPlayer + " players" +
                    "\nPlayer names: " + player_name);

        }
        else if (amountPlayer == 3) {
            player_name.add("Killer");
            player_name.add("Richy");
            player_name.add("Rocky");
            System.out.println("Your choice is: " + amountPlayer + " players" +
                    "\nPlayer names: " + player_name);
        }
            else if (amountPlayer == 4) {
            player_name.add("Killer");
            player_name.add("Richy");
            player_name.add("Rocky");
            player_name.add("Joe");
            System.out.println("Your choice is: " + amountPlayer + " players" +
            "\nPlayer names: " + player_name);
        }
            else {
            System.out.println("Error...Please enter number between 1-4");
        }
    }
*/

    public ArrayList<Animal> getPlayerPokemon() {
        return this.playerAnimal;
    }

    public int getMoney() {
        return this.money;
    }

    public Food getFood(int index) {
        return (Food)this.playerFood.get(index);
    }

    public ArrayList<Food> getPlayerFood() {
        return this.playerFood;
    }

    public Animal getAnimal(int index) {
        return (Animal) this.playerAnimal.get(index);
    }

    private void addAnimal(Animal newAnimal) {
        this.playerAnimal.add(newAnimal);
    }

    public void buyItem(int itemPrice) {
        this.money -= itemPrice;
    }


    //public void getPlayers() {
      //  System.out.println("Players list" + players);

    }

