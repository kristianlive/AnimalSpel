package com.company;

import java.util.ArrayList;

public class Player extends Game {
    public Game game;
    private String name;
    private int money;
    private ArrayList<Animal> playerAnimal;
    private ArrayList<Food> playerFood;


    public Player(String name, int money) {
        this.name = name;
        this.money = money;
        this.playerAnimal = new ArrayList();
        this.playerFood = new ArrayList();
    }

    public ArrayList<Animal> getPlayerPokemon() {
        return this.playerAnimal;
    }

    public int getMoney() {
        return this.money;
    }

    public String getName() {
        return this.name;
    }

    public Food getFood(int index) {
        return (Food)this.playerFood.get(index);
    }

    public ArrayList<Food> getPlayerFood() {
        return this.playerFood;
    }

    public Animal getAnimal(int index) {
        return (Animal) this.playerAnimal.get(index);
    }

    private void addAnimal(Animal newAnimal) {
        this.playerAnimal.add(newAnimal);
    }


    public void getPlayers() {
        System.out.println("Players list" + players);
    }




    }

