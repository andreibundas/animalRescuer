package org.fasttrackit;

public class Veterinarian extends Human {

    String specialziation;
    boolean smoker;

    public Veterinarian(String name, String specialziation) {
        super(name);
        this.specialziation = specialziation;
    }
}
