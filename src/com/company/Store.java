package com.company;

import com.company.AnimalType.*;
import com.company.FoodClasses.Food;

import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Store implements Serializable {
    int inputBuyAnimalChoice, buyFoodChoice;

    private Game myGame;
    private ArrayList<Animal> playerAnimal = new ArrayList<>();
    private ArrayList<Food> playerFood = new ArrayList<>();

    public Store() {
        this.buyAnimal();
        //this.buyFood();
    }

    public void displayFood(Player customer) {

    }
    private void addAnimalToStore(){
        if (this.playerAnimal !=null){
            this.playerAnimal.clear();
        }
        assert this.playerAnimal !=null;

        this.playerAnimal.add(new Bird());
        this.playerAnimal.add(new Cat());
        this.playerAnimal.add(new Dog());
        this.playerAnimal.add(new Fish());

    }
    public void buyAnimal (){

    }

    private ArrayList<Animal> animalList = new ArrayList();
    private ArrayList<Food> foodList = new ArrayList();

    public void getAnimalList() {
        for (int i = 0; i < animalList.size(); i++) {
            System.out.println(animalList.get(i).getName() + " ");
        } // to give a choice to user use dialogs menu
    }
}


