package org.fasttrackit;

public class Dog extends Pets {
    int biteLevel;

    public int getBiteLevel() {
        return biteLevel;
    }

    public Dog(String name) {
        super(name);
    }

    public void setBiteLevel(int biteLevel) {
        this.biteLevel = biteLevel;
    }


}
