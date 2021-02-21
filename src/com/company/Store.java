package com.company;

import com.company.AnimalType.*;
import com.company.FoodClasses.Apple;
import com.company.FoodClasses.Cake;
import com.company.FoodClasses.Pizza;
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

    public void buyFood(Player player) {
        int foodClasses = Dialogs.promptInt("Please choice food 1 Apple, 2 Cake, " +
                " 3 Pizza ", 1, 4);

        Food newFood = switch (foodClasses) {
            case 1 -> new Apple();
            case 2 -> new Cake();
            case 3 -> new Pizza();
            default -> throw new IllegalStateException("Unexpected value: " + foodClasses);
        };
        checkCashFood(player, newFood);
    }

    public void checkCashFood(Player player, Food newFood) {
        if (player.getMoney() >= newFood.getPrice()) {
            player.buyItem(newFood.getPrice());
            player.getPlayerFood().add(newFood);
            System.out.println("Yey! You bought a new food !"
                    + "\nMoney Left: " + player.getMoney());
        } else {
            System.out.println("Oh no! You do not have enough money to buy this food.");
        }
    }


    public void sellAnimal(Player player) {
        System.out.println("List of all your animals Name");
        player.displayAnimal();
        int animalType = Dialogs.promptInt("Please enter ID number which Animal do you want to sell"
                , 1, 7);

        Animal removeAnimal = switch (animalType) {
            case 1 -> player.playerAnimal.remove(0);
            case 2 -> player.playerAnimal.remove(1);
            case 3 -> player.playerAnimal.remove(2);
            case 4 -> player.playerAnimal.remove(3);
            case 5 -> player.playerAnimal.remove(4);
            case 6 -> player.playerAnimal.remove(5);
            case 7 -> player.playerAnimal.remove(6);
            default -> throw new IllegalStateException("Unexpected value: " + animalType);
        };
        player.sellItem(removeAnimal.getPrice());
        System.out.println("You Sold your Animal !"
                + "\nMoney Left: " + player.getMoney());
        player.displayAnimal();
    }
    public void checkIfPlayerHasEnoughCash(Player player, Animal newAnimal) {
        if (player.getMoney() >= newAnimal.getPrice()) {
            player.buyItem(newAnimal.getPrice());
            player.getPlayerAnimal().add(newAnimal);
            System.out.println("Yey! You bought a new animal!"
                    + "Money Left: " + player.getMoney());
        } else {
            System.out.println("Oh no! You do not have enough money to buy this animal.");
        }
    }
    public String chooseGender() {
        String chosenGender = "";
        var gender = Dialogs.prompt("1 male , 2 female");
        if (gender.equals("1")) {
            chosenGender = "male";
        } else if (gender.equals("2")) {
            chosenGender = "female";
        } else
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


