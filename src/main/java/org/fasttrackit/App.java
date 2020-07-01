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

        Adopter adopter = new Adopter();
        adopter.name = "Aladin";
        adopter.moneyAvailable = 150; // RON
        adopter.gender = 'M';

        Animal animal =new Animal();
        animal.race = "cat";
        animal.age = 3;
        animal.favoriteFood = "pizza";
        animal.healthLevel = 9;
        animal.hungerLevel = 10;
        animal.name = "Garfield";
        animal.stateOfMind = "sober";
        animal.recreationActivity = "watchingTV";
        animal.gender = 'M';


        PetFood petfood = new PetFood();
        petfood.name = "pizza";
        petfood.availableInStore = true;
        petfood.price = 25; // RON
        petfood.quantity = 2;
        petfood.expiryDate = "22.07.2020";

        RecreationActivity recractivity = new RecreationActivity();
        recractivity.name = "watchingTV";

        Veterinarian vet = new Veterinarian();
        vet.name = "Dr. Dolittle";
        vet.specialziation = "cat & dogs";
        vet.gender = 'M';




    }



}
