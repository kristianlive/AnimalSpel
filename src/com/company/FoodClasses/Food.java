package com.company.FoodClasses;

import com.company.AnimalType.Animal;
import com.company.Dialogs;
import com.company.Player;

public abstract class Food {
    public int price;
    public int amountFood;


    public int healthPoint;

    public Food() {
    }

    public int getQuantityFood() {
        return amountFood;
    }


    public int getPrice() {
        return this.price;
    }
    public int getHealthPoint() {
        return healthPoint;
    }
    public void removeFood(int quantity) {
        this.amountFood -= quantity;
    }
    public void addFood(int quantity) {
        this.amountFood += quantity;
    }



    public String getType() {
        return this.getClass().getSimpleName();
    }


}


