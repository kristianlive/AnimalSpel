package com.company;

import com.company.AnimalType.Animal;
import com.company.FoodClasses.Food;

import java.util.ArrayList;

public class Store {
    private ArrayList<Animal> animalList = new ArrayList();
    private ArrayList<Food> foodList = new ArrayList();

    public void getAnimalList() {
        for (int i = 0; i < animalList.size(); i++) {
            System.out.println(animalList.get(i).getName() + " ");
        } // to give a choice to user use dialogs menu
    }
}


