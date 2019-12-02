package org.fasttrackit;

public class Adopter {
    private String name;
    private double moneyAvailable;

    public Adopter(String name) {
        this.name = name;
    }

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



    public void AdopterPlayAnimal (Animal animal,RecreationalActivity recreationalActivityName) {
        System.out.println(getName() + " play " + recreationalActivityName.getName() + " whit " + animal.getName());
        System.out.println("Mood level is " + animal.getMoodLevel());
        animal.setMoodLevel(animal.getMoodLevel() - 1);
    }
    public void feedAnimal(Food food, Animal animal) {
        System.out.println(getName() + " just gave some " + food.getName() + " food to " + animal.getName());
        System.out.println("Hungry level is: " + animal.getHungerLevel());
        animal.setHungerLevel(animal.getHungerLevel() - 1);}

    }

