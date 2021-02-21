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
    public ArrayList<Animal> playerAnimal = new ArrayList<>();
    public ArrayList<Food> playerFood = new ArrayList<>();

    public boolean canBuyAnimal = true;
    public boolean canSellAnimal = true;
    public boolean canBuyFood = true;
    public boolean canAnimal = true;
    public boolean canFeedAnimal = true;
    public boolean roundDone = false;

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return this.money;
    }


    public Player(String name) {
        this.name = name;
    }


    public ArrayList<Animal> getPlayerAnimal() {
        return playerAnimal;
    }

    public void displayAnimal() {
        for (int i = 0; i < playerAnimal.size(); i++) {
            System.out.println("["+(1+i)+"]"+playerAnimal.get(i).getName() + " ");
        }}

        public void displayFood() {
            for (int i = 0; i < playerFood.size(); i++) {
                System.out.println("["+(1+i)+"]"+playerFood.get(i) + " ");

    }}

    public ArrayList<Food> getPlayerFood() {
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
    public void sellItem(int itemPrice) {
        this.money += itemPrice;
    }

    public Food getFood(int index) {
        return (Food)this.playerFood.get(index);
    }

    public void accessShops(boolean setAllTrue) {
        if (setAllTrue) {
            this.canBuyAnimal = true;
            this.canSellAnimal = true;
            this.canBuyFood = true;
            this.canFeedAnimal = true;
        } else {
            this.canBuyAnimal = false;
            this.canSellAnimal = false;
            this.canBuyFood = false;
            this.canFeedAnimal = false;
        }
    }
}

