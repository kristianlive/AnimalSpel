package com.company;

import com.company.AnimalType.*;
import com.company.FoodClasses.Food;

import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Serializable {
    public Game game;
    private String name; // set game and get name exist
    private int money = 200;
    private ArrayList<Animal> playerAnimal;
    private ArrayList<Food> playerFood;
    public boolean canBuyAnimal = true;
    public boolean canSellAnimal = true;
    public boolean canBuyFood = true;
    public boolean canAnimal = true;
    public boolean canFeedAnimal = true;
    public boolean roundDone = false;

    public ArrayList<Player> player_name;

    private void setName(String name) {
        this.name = name;
    }
    public String getName() {return name;}

    public void setMoney(int money) {this.money = money;}

    public int getMoney() {return this.money;}

    public Player(String name) {
        this.name = name;
        this.money = money;
        this.playerAnimal = new ArrayList();
        this.playerFood = new ArrayList();
    }

    public ArrayList<Animal> getPlayerAnimal() {
        return this.playerAnimal;
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

