package com.company.AnimalType;

import com.company.AnimalType.Animal;
import com.company.FoodClasses.Apple;
import com.company.FoodClasses.Cake;
import com.company.FoodClasses.Food;
import com.company.FoodClasses.Pizza;

public class Dog extends Animal {
    public Dog(String name, String gender) {
        this.price = 90;
        this.maxAge = 13;
        this.maxOffspring = 7;
        this.eatFood = new Food[]{new Apple(), new Cake(), new Pizza()};
        this.gender =  gender;
        this.name = name;
    }
}
