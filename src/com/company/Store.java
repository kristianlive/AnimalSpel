package com.company;

import com.company.AnimalType.Animal;
import com.company.FoodClasses.Food;

import java.util.ArrayList;

public class Store {
    private Game game;
    private ArrayList<Animal> playerAnimal = new ArrayList();
    private ArrayList<Food> playerFood = new ArrayList();

    public Store() {
        this.addPlayerAnimal();
       // this.addplayerFood();
    }

    private void addPlayerAnimal() {
        if (this.playerAnimal != null) {
            this.playerAnimal.clear();
        }
    }
}
