package com.company.AnimalType;

import com.company.FoodClasses.Food;

import java.io.Serializable;
import java.util.Set;

    public abstract class Animal implements Serializable {

        public Animal() { }
        protected String name;
        protected String gender;
        protected int health = 100;
        public boolean sick = false;
        protected int age = 0;
        protected int maxAge;
        protected int price;
        protected int maxOffspring;
        protected Food[] eatFood;
        protected Set<Food> canEat;


        public String getName() {
            return name; }
        public int getHealth() {
            return this.health;
        }

        public String getGender() {
            return this.gender;
        }

        public int getAge() {
            return this.age;
        }

        public int getMaxAge() {
            return this.maxAge;
        }

        public int getPrice() {
            return this.price;
        }

        public Food[] getEatFood() {
            return this.eatFood;
        }


        public void eat(Food food, int quantity) {
            for (int i = 0; i < quantity; ++i) {
                this.health += (int) ((double) this.health * 0.1D);
            }

            this.health = Math.min(this.health, 100);
        }



        }

