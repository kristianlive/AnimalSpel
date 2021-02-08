package com.company.AnimalType;

import com.company.FoodClasses.Food;

import java.io.Serializable;
import java.util.Set;

    public abstract class Animal implements Serializable {
        static enum Gender {
            FEMALE,
            MALE;
            private Gender() { }}
        public Animal() { }

        protected String name;
        protected int health = 100;
        protected Animal.Gender gender;
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

        public Animal.Gender getGender() {
            return this.gender;
        }

        public String getGenderString() {
            return this.gender.toString().toLowerCase();
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

        public void setGender(int n) {
            if (n == 1) {
                this.gender = Animal.Gender.FEMALE;
            } else {
                this.gender = Animal.Gender.MALE;
            }

            Bird bird = new Bird();
            Cat cat = new Cat();
            Dog dog = new Dog();
            Fish fish = new Fish();

        }
    }
