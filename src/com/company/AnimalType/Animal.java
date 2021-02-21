package com.company.AnimalType;

import com.company.FoodClasses.Food;

import java.io.Serializable;
import java.util.Set;

    public abstract class Animal implements Serializable {


        public Animal() {
            beOlder(10);
            warnPlayer();
        }
        public void decreaseHealthAndAge() {
            this.health -= (int) (Math.random() * (20)) + 10; //10-30% of the HP will disappear
            this.age = this.age + 1;

        }

        protected String name;
        protected String gender;
        public int health = 100;
        public boolean sick = false;
        protected int age = 0;
        protected int maxAge;
        protected int price;
        protected int maxOffspring;
        protected Food[] eatFood;
        protected Set<Food> canEat;

        public String getName() {
            return name;
        }

        public int getHealth() {
            return this.health;
        }

        public void warnPlayer() {
            if (this.health < 20)
                System.out.println("!!! Your animal going to die soon !!!"
                + this.health);
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


        public void beOlder(int beingOlder) {
            this.health -= beingOlder;
        }
        public void displayAge (){
            System.out.println(this.health);
        }

        public void eat(Food food, int quantity) {
            for (int i = 0; i < quantity; ++i) {
                this.health += (int) ((double) this.health * 0.1D);
            }

            this.health = Math.min(this.health, 100);
        }



        }

