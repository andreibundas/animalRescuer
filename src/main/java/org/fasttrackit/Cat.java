package org.fasttrackit;

public class Cat extends Animal {

    private String hairColour;


    public Cat(String race, int stateOfMind) {
        super(race, stateOfMind);
    }
    @Override
    public void happiness() {
        super.happiness();
        if (getStateOfMind() > 5) {
            System.out.println("Cat purrs");
        }
    }
}
