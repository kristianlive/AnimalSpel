package com.company.AnimalType;

import com.company.Dialogs;
import com.company.FoodClasses.Food;
import com.company.Player;
import com.company.Store;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

    public class Animal implements Serializable {
        Store store = new Store();
        String chosenGender;


        public Animal() {
        }

        public void decreaseHealthAndAge() {
            this.health -= (int) (Math.random() * (20)) + 10; //10-30% of the HP will disappear
            this.age = this.age + 1;

        }

        protected String name;
        protected String gender;
        public int health = 100;
        protected int age = 0;
        protected int maxAge;
        protected int price;
        protected int maxOffspring;

        public ArrayList<Food> getCanEatFood() {
            return canEatFood;
        }

        protected ArrayList<Food> canEatFood;

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
        public String getBreed() {
            return this.getClass().getSimpleName();
        }

        public int getMaxAge() {
            return this.maxAge;
        }


        public int getPrice() {
            return this.price;
        }



        public void beOlder(int beingOlder) {
            this.health -= beingOlder;
        }

        public void displayAge() {
            System.out.println(this.health);
        }
        public void eat(Food food, int quantity) {
            for(int i = 0; i < quantity; ++i) {
                this.health += (int)((double)this.health * 0.1D);
            }

            this.health = Math.min(this.health, 100);


        }
        public static boolean getRandomBoolean() {
            return Math.random() < 0.5;
        }
        public void mateAnimals(Player player) {

            int animalType = Dialogs.promptInt("Please choice which animals you want to mate 1 bird, 2 cat, " +
                    " 3dog , 4 fish", 1, 4);
            var gender = this.randomGender();

            var name = Dialogs.prompt("Please write name of your animal");

            Animal newAnimal = switch (animalType) {
                case 1 -> new Bird(name, gender);
                case 2 -> new Cat(name, gender);
                case 3 -> new Dog(name, gender);
                case 4 -> new Fish(name, gender);
                default -> throw new IllegalStateException("Unexpected value: " + animalType);
            };
            System.out.println("Congratulations you got a: " + chosenGender);
            }

        public String randomGender() {
             this.chosenGender = "";
            Boolean gender = getRandomBoolean();
            if (gender.equals(true)) {
                this.chosenGender = "male";
            } else if (gender.equals(false)) {
                this.chosenGender = "female"; }
            return this.chosenGender;
        }}

