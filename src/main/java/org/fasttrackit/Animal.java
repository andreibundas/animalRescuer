package org.fasttrackit;

public class Animal extends LivingBeing {


    String race;
    double age;
    int healthLevel;
    int hungerLevel;
    String stateOfMind;  // nivelul stării de spirit
    String favoriteFood;
    String recreationActivity;


    public Animal(char gender) {
        super(gender);
    }
}
