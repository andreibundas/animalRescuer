package org.fasttrackit;

public class Adopter extends Human{

    private int moneyAvailable;
    private char gender;

    public Adopter(String name, char gender) {
        super(name);
        this.gender = gender;
    }

    // declararea metodei feed -> hranirea anumalului
    public void feed (Animal animal, PetFood petfood) {
        System.out.println(super.getName() + " just gave some " + petfood.getName() + " food to " + animal.getName());

        animal.setHungerLevel(animal.getHungerLevel() - 8);

        System.out.println("After eating, the animal's hunger level decreased to : " + animal.getHungerLevel());

        if(petfood.getName().equals(animal.getFavoriteFood())) {  //  if(petfood.name == animal.favoriteFood) -> verifica referinta obiectului nu egalitatea valorii stringurilor
            animal.setStateOfMind(animal.getStateOfMind() + 1);
            System.out.println("Also, after eating the " + petfood.getName() +
                    " the animal's stateOfMind rised to : " + animal.getStateOfMind());
        }
    }
    // declararea metodei play -> recreerea animalului
    public void play (Animal animal, RecreationActivity recreationActivity) {
        System.out.println(super.getName() + " enjoys " +
                recreationActivity.getName() + " with his beloved pet " + animal.getName());

        // animal.stateOfMind = 8; - se elimina - a fost introdus suplimentar

//        System.out.println("After " + recreationActivity.getName() + " the animal's stateOfMind becomes : " +
//                "" + animal.getStateOfMind());
        if(recreationActivity.getName().equals(animal.getFavoriteRecreationActivity())) {   // if(recreationActivity.name == animal.favoriteRecreationActivity)
            animal.setStateOfMind(animal.getStateOfMind() + 2);
            System.out.println("After " + recreationActivity.getName() +
                    " the animal's stateOfMind jumps to : " + animal.getStateOfMind());
        } else {
            animal.setStateOfMind(animal.getStateOfMind() + 1);
            System.out.println("After " + recreationActivity.getName() +
                    "the animal's stateOfMind rises to : " + animal.getStateOfMind());
        }

    }

    public int getMoneyAvailable() {
        return moneyAvailable;
    }

    public void setMoneyAvailable(int moneyAvailable) {
        this.moneyAvailable = moneyAvailable;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
