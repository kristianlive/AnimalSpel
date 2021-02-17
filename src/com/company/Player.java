package com.company;

import com.company.AnimalType.*;
import com.company.FoodClasses.Apple;
import com.company.FoodClasses.Cake;
import com.company.FoodClasses.Food;
import com.company.FoodClasses.Pizza;
import com.company.Player.*;
import java.io.Serializable;
import java.util.ArrayList;
import com.company.FoodClasses.Food.*;
public class Player implements Serializable {
    public Game game;

    private String name; // set game and get name exist
    private int money = 200;
    public final ArrayList<Animal> playerAnimal = new ArrayList<>();
    public final Food[] playerFood = {
            new Apple(),
            new Cake(),
            new Pizza()};
    public boolean canBuyAnimal = true;
    public boolean canSellAnimal = true;
    public boolean canBuyFood = true;
    public boolean canAnimal = true;
    public boolean canFeedAnimal = true;
    public boolean roundDone = false;

    private void setName(String name) {
        this.name = name;
    }
    public String getName() {return name;}

    public void setMoney(int money) {this.money = money;}

    public int getMoney() {return this.money;}


    public Player(String name) {this.name = name;}

    public ArrayList<Animal> getPlayerAnimal() {
        return playerAnimal;
    }

    public Food[] getPlayerFood() {
        return playerFood;
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

