package com.company.AnimalType;

import com.company.FoodClasses.Apple;
import com.company.FoodClasses.Cake;
import com.company.FoodClasses.Pizza;
import com.company.FoodClasses.Food;

public class Bird extends Animal {
    public Bird(String name, String gender) {
        this.price = 30;
        this.maxAge = 10;
        this.maxOffspring = 3;
        this.eatFood = new Food[]{new Apple(), new Cake(), new Pizza()};
        this.gender = gender;
        this.name = name;
    }

}

