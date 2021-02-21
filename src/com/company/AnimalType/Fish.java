package com.company.AnimalType;

import com.company.AnimalType.Animal;
import com.company.FoodClasses.Apple;
import com.company.FoodClasses.Cake;
import com.company.FoodClasses.Food;
import com.company.FoodClasses.Pizza;

public class Fish extends Animal {
    public Fish(String name, String gender) {
        this.price = 25;
        this.maxAge = 5;
        this.maxOffspring = 5;
        this.gender =  gender;
        this.name = name;
    }
}
