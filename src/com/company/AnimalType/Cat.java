package com.company.AnimalType;

import com.company.AnimalType.Animal;
import com.company.FoodClasses.Apple;
import com.company.FoodClasses.Cake;
import com.company.FoodClasses.Food;
import com.company.FoodClasses.Pizza;

public class Cat extends Animal {
            public Cat() {
                this.price = 50;
                this.maxAge = 15;
                this.maxOffspring = 4;
                this.eatFood = new Food[]{new Apple(), new Cake(), new Pizza()};
            }
        }

