package com.company.AnimalType;

import com.company.FoodClasses.Food;

import java.io.Serializable;
import java.util.Set;



    public abstract class Animal implements Serializable {
        protected String name;
        protected int health = 100;
        public boolean isSick = false;
        protected int maxOffspring;
        protected Set<Food> canEat;
        protected Food[] canEatFood;
        protected int age = 0;
        protected int maxAge;
        protected int price;

    }
