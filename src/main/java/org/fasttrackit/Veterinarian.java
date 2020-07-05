package org.fasttrackit;

public class Veterinarian extends Human {

    String specialization;
    boolean smoker;

    public Veterinarian(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }
}
