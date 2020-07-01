package org.fasttrackit;

public class Adopter extends Human{


    int moneyAvailable;


    public Adopter(char gender) {
        super(gender);
    }

    public Adopter() {
        super();
    }

    public void feed (Animal animal,PetFood petfood) {
        System.out.println(this.name + " just gave some " + petfood + " food to " + animal);

    }


}
