package org.fasttrackit;

public class Adopter {
    private String name;
    private double moneyAvailable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoneyAvailable() {
        return moneyAvailable;
    }

    public void setMoneyAvailable(double moneyAvailable) {
        this.moneyAvailable = moneyAvailable;
    }

    public Adopter(String name) {
        this.name = name;
    }
    public void AdopterFeedAnimal (String animalName,String foodName) {
        System.out.println(name + " just gave some " + foodName + " to " + animalName);










    }
}
