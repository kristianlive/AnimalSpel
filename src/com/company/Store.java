package com.company;

import com.company.AnimalType.*;
import com.company.Player.*;
import com.company.Game.*;
import com.company.FoodClasses.Food;
import com.company.AnimalType.Animal;
import java.util.Scanner;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Store implements Serializable {
    int inputBuyAnimalChoice, buyFoodChoice;
    String inputName;
    private Game game;
    int moneyChange;

    public Store() {
    }

    public void displayFood(Player customer) {
    }


    public void buyAnimal(Player player) {

        int animalType = Dialogs.promptInt("Please choice animal 1 bird, 2 cat, " +
                " 3dog , 4 fish", 1, 4);
        var gender = chooseGender();

        var name = Dialogs.prompt("Please write name of your animal");

        Animal newAnimal = switch (animalType) {
            case 1 -> new Bird(name, gender);
            case 2 -> new Cat(name, gender);
            case 3 -> new Dog(name, gender);
            case 4 -> new Fish(name, gender);
            default -> throw new IllegalStateException("Unexpected value: " + animalType);
        };
        checkIfPlayerHasEnoughCash(player, newAnimal);
    }

    public void checkIfPlayerHasEnoughCash(Player player, Animal newAnimal) {
        if (player.getMoney() >= newAnimal.getPrice()) {
            player.buyItem(newAnimal.getPrice());
            player.getPlayerAnimal().add(newAnimal);
            System.out.println("Yey! You bought a new animal!"
            + "Money Left: " + player.getMoney() );
        } else {
            System.out.println("Oh no! You do not have enough money to buy this animal.");
        }
    }


        public String chooseGender(){
            String chosenGender = "";
            var gender = Dialogs.prompt("1 male , 2 female");
            if(gender.equals("1")){
                chosenGender = "male";
            }else if (gender.equals("2")){
                chosenGender = "female";
            }else
                System.out.println("Please enter the number 1 or 2 ");
            return chosenGender;
        }
    }

/*
    public void getAnimalList() {
        for (int i = 0; i < animalList.size(); i++) {
            System.out.println(animalList.get(i).getName() + " ");
        } // to give a choice to user use dialogs menu
    }
}*/


