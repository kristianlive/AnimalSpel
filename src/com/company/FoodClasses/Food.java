package com.company.FoodClasses;

public abstract class Food {
    public int price;
    public int amount;
    public int healthPoint;
    public Food() {
    }



    public int getAmount() {
        return this.amount;
    }

    public void addFood(int quantity) {
        this.amount += quantity;
    }

    public void removeFood(int quantity) {
        this.amount -= quantity;
    }

    public int getPrice() {
        return this.price;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
}






