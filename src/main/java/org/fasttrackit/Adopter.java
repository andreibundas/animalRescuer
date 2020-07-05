package org.fasttrackit;

public class Adopter extends Human{

    int moneyAvailable;
    char gender;

    public Adopter(String name, char gender) {
        super(name);
        this.gender = gender;
    }

    // declararea metodei feed -> hranirea anumalului
    public void feed (Animal animal, PetFood petfood) {
        System.out.println(super.name + " just gave some " + petfood.name + " food to " + animal.name);

        animal.hungerLevel -= 8;

        System.out.println("After feeding the animal, the hunger level becomes : " + animal.hungerLevel);

    }
    // declararea metodei play -> recreerea animalului
    public void play (Animal animal, RecreationActivity recreationActivity) {
        System.out.println(super.name + " enjoys " +
                recreationActivity.name + " in the park with his beloved dog " + animal.name);

        animal.stateOfMind = "happy";

        System.out.println("After the walk, the animal's stateOfMind becomes : " +
                "" + animal.stateOfMind);

    }


}
