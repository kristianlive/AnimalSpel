package com.company.FoodClasses;

import com.company.AnimalType.Animal;
import com.company.Dialogs;
import com.company.Game;
import com.company.Player;

import java.io.Serializable;
import java.util.ArrayList;

public class Feed implements Serializable {
    Game game;

    public Feed() {

    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void feedAnimal(Player player) {
        if (player.getPlayerAnimal().size() != 0 && player.getPlayerFood().size() != 0) {
            while (true) {
                System.out.println("===== Feed your Animal =====\n");
                player.displayAnimal();
                int animalIndex = Dialogs.promptInt("Which Animal will you feed: ", 0,
                        player.getPlayerAnimal().size());
                if (animalIndex == 0) {
                    return;
                }
                System.out.println("===== Feed your Animal =====\n");
                player.displayFood();
                System.out.println("Choose food: ");
                int anmFood = Dialogs.getInt(0, player.getPlayerFood().size());
                if (anmFood != 0) {
                    Food food = player.getFood(anmFood -1 );
                    System.out.println("Max food you can take: " + food.getQuantityFood()
                    + "\n Enter '0' if you are done with feeding");
                    int amount = Dialogs.getInt(0, player.getFood(anmFood - 1).getQuantityFood());

                    if (amount == 0) {
                        return;
                    }
                    player.getAnimal(animalIndex - 1).eat(player.getFood(anmFood - 1), amount);
                    player.getFood(anmFood - 1).removeFood(amount);
                    player.accessShops(false);
                    player.canFeedAnimal = true;
                } else {
                    Animal anim = player.getAnimal(animalIndex - 1);
                    System.out.println("Error... try another animal than: " + anim);
                }
            }
        } else {
            if (player.getPlayerAnimal().size() == 0) {
                System.out.println("You haven't got any Animal");
            } else {
                System.out.println("You have no food");
            }

            Dialogs.inputEnter();
        }
    }
        public boolean isRightFood(Animal animal, Food food) {
            ArrayList<Food> food1 = animal.getCanEatFood();
            int food2 = food1.size();

            for (Food animalFood : food1) {
                if (animalFood.getType().equals(food.getType())) {
                    return true;
                }
            }

            return false;
    }}

