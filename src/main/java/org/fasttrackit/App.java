package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        String name = new String();
        //String name = null;

        char gender = 0;
        Adopter adopter = new Adopter(name, gender);
        adopter.name = "Aladin";
        adopter.moneyAvailable = 150; // RON
        adopter.gender = 'M';


        Animal animal =new Animal(name);
        animal.race = "cat";
        animal.age = 3;
        animal.favoriteFood = "pizza";
        animal.healthLevel = 9;
        animal.hungerLevel = 10;
        animal.name = "Garfield";
        animal.stateOfMind = "sober";
        animal.recreationActivity = "watchingTV";


        PetFood petfood = new PetFood(name);
        petfood.name = "pizza";
        petfood.availableInStore = true;
        petfood.price = 25; // RON
        petfood.quantity = 2;
        petfood.expiryDate = "22.07.2020";

        RecreationActivity recractivity = new RecreationActivity(name);
        recractivity.name = "watchingTV";

        String specialziation = new String();
        Veterinarian vet = new Veterinarian(name, specialziation);
        vet.name = "Dr. Dolittle";
        vet.specialziation = "cat & dogs";
        vet.smoker = false;


    }


}
