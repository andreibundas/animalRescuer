package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )     {
        System.out.println( "Hello World!" );

        String name = "";
        //String name = null;

        char gender = 0;
        Adopter adopter = new Adopter(name, gender);
        adopter.setName("Aladin");
        adopter.setMoneyAvailable(150); // RON
        adopter.setGender('M');


        Animal animal =new Animal(name);
        animal.setRace("cat");
        animal.setAge(3);
        animal.setFavoriteFood("pizza");
        animal.setHealthLevel(9);
        animal.setHungerLevel(10);
        animal.setName("Garfield");
        animal.setStateOfMind(5);
        animal.setFavoriteRecreationActivity("watching TV");



        PetFood petfood = new PetFood(name);
        petfood.setName("pizza");
        petfood.setAvailableInStore(true);
        petfood.setPrice(25); // RON
        petfood.setQuantity(2);
        petfood.setExpiryDate("22.07.2020");

        RecreationActivity recractivity = new RecreationActivity(name);
        recractivity.setName("watchingTV");

        String specialization = "";
        Veterinarian vet = new Veterinarian(name, specialization);
        vet.setName("Dr. Dolittle");
        vet.setSpecialization("cats & dogs");
        vet.setSmoker(false);

        // apelare, invocare metoda feed - hranirea animalului
        adopter.setName("John");
        petfood.setName("Purina");
        animal.setName("Chaika");
        petfood.setName("pizza");

        adopter.feed(animal, petfood);


        // apelare, invocare metoda play - recreerea animalului
        adopter.setName("Tom");
        recractivity.setName("walking");
        animal.setName("Johns");
        recractivity.setName("watching TV");
        adopter.play(animal, recractivity);

    }


}
