package org.fasttrackit;


import java.time.LocalDateTime;

public class AnimalFood extends Food{
    boolean edibleForAnimals;

    public AnimalFood(String name) {
        super(name);
    }

    public boolean isEdibleForAnimals() {
        return edibleForAnimals;
    }

    public void setEdibleForAnimals(boolean edibleForAnimals) {
        this.edibleForAnimals = edibleForAnimals;
    }


}
