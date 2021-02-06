package com.company.AnimalType;

import com.company.FoodClasses.Food;

import java.io.Serializable;
import java.util.Set;



    public abstract class Animal implements Serializable {
        private String name;
        private int health = 100;
        private String male;
        private String female;

        public String getName() {
            return name;
        }

        Bird bird = new Bird();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();

    }
