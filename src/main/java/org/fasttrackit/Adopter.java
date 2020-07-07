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

        if(petfood.name.equals(animal.favoriteFood)) {  //  if(petfood.name == animal.favoriteFood)
            animal.stateOfMind += 1;
            System.out.println("The animal's stateOfMind rises to : " + animal.stateOfMind);
        }


    }
    // declararea metodei play -> recreerea animalului
    public void play (Animal animal, RecreationActivity recreationActivity) {
        System.out.println(super.name + " enjoys " +
                recreationActivity.name + " in the park with his beloved dog " + animal.name);

        animal.stateOfMind = 8;

        System.out.println("After the walk, the animal's stateOfMind becomes : " +
                "" + animal.stateOfMind);
        if(recreationActivity.name.equals(animal.favoriteRecreationActivity)) {   // if(recreationActivity.name == animal.favoriteRecreationActivity)
            animal.stateOfMind += 2;
            System.out.println("The animal's stateOfMind jumps to : " + animal.stateOfMind);
        } else {
            animal.stateOfMind += 1;
            System.out.println("The animal's stateOfMind rises to : " + animal.stateOfMind);
        }


    }

}
