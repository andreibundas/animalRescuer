package org.fasttrackit;

public class Animal {

    private String name;
    private String race;
    private double age;
    private int healthLevel;
    private int hungerLevel;
    private int stateOfMind;  // nivelul stării de spirit
    private String favoriteFood;
//    String recreationActivity;
    private String favoriteRecreationActivity;

    //  constructor
    public Animal(String race, int stateOfMind) {
        this.race = race;
        this.stateOfMind = stateOfMind;
    }

    //metoda stare spirit animal
    public void happiness() {
        if(stateOfMind > 5) {
            System.out.println("The animal is happy");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getStateOfMind() {
        return stateOfMind;
    }

    public void setStateOfMind(int stateOfMind) {
        this.stateOfMind = stateOfMind;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteRecreationActivity() {
        return favoriteRecreationActivity;
    }

    public void setFavoriteRecreationActivity(String favoriteRecreationActivity) {
        this.favoriteRecreationActivity = favoriteRecreationActivity;
    }
}
