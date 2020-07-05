package org.fasttrackit;

public class Adopter extends Human{

    int moneyAvailable;
    char gender;

    public Adopter(String name, char gender) {
        super(name);
        this.gender = gender;
    }

    public void feed (Animal animal, PetFood petfood) {
        System.out.println(super.name + " just gave some " + petfood + " food to " + animal);

    }


}
