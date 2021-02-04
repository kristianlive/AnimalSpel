package com.company.AnimalType;

import com.company.FoodClasses.Apple;
import com.company.FoodClasses.Cake;
import com.company.FoodClasses.Pizza;
import com.company.FoodClasses.Food;

public class Bird extends Animal {
    public Bird() {
        this.price = 500;
        this.maxAge = 12;
        this.maxOffspring = 3;
        this.canEatFood = new Food[]{new Apple(), new Cake(), new Pizza()};
    }
}