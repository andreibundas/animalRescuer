package org.fasttrackit;

public class Dog extends Animal {

    private String sizeType;

    public Dog(String race, int stateOfMind) {
        super(race, stateOfMind);
    }

    @Override
    public void happiness() {
        super.happiness();
        if(getStateOfMind() > 5) {
            System.out.println("The dog wags its tail");
        }
    }
}
