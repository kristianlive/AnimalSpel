package com.company.FoodClasses;

public abstract class Food {
    public int price;
    public int amount;
    public int healthPoint;




    public int getAmount() {
        return this.amount;
    }

    public void addFood(int amount) {
        this.amount += amount;
    }

    public void removeFood(int amount) {
        this.amount -= amount;
    }
        public int getPrice(){
            return this.price;}
        }






