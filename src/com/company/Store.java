package com.company;

import com.company.AnimalType.Animal;
import com.company.FoodClasses.Food;

import java.io.Serializable;
import java.util.ArrayList;

public class Store implements Serializable {
    int inputBuyAnimalChoice, buyFoodChoice;

    private final Game myGame;

    public Store(Game myGame) {
        this.myGame = myGame;

    }

    public void buyAnimal(Player  player) {

        do {
            inputBuyAnimalChoice = Dialogs.menu("Buy a Bird", "Buy a Cat", "Buy a Dog", "Buy Fish");
            switch (inputBuyAnimalChoice) {
                case 1 ->


            }
        }while ();

    }
    public void buyAnimal (Player player, int price, int inputChoice){

    }

    private ArrayList<Animal> animalList = new ArrayList();
    private ArrayList<Food> foodList = new ArrayList();

    public void getAnimalList() {
        for (int i = 0; i < animalList.size(); i++) {
            System.out.println(animalList.get(i).getName() + " ");
        } // to give a choice to user use dialogs menu
    }
}


