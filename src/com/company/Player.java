package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
public class Player implements Serializable {
    public Game game;
    private final String name;
    private int money;
    private ArrayList<Animal> playerAnimal;
    private ArrayList<Food> playerFood;


    public Player(String name, int money) {
        this.name = name;
        this.money = money;
        this.playerAnimal = new ArrayList();
        this.playerFood = new ArrayList();
    }

    public ArrayList<Animal> getPlayerPokemon() {
        return this.playerAnimal;
    }

    public int getMoney() {
        return this.money;
    }

    public String getName() {
        return this.name;
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

