package org.fasttrackit;

public class Pets extends Animal {
    private String master;
    private String toys;

    @Override
    public void  animalMood (){
        System.out.println("The pets is happy!");
    }

    public String getMaster() {
        return master;
    }
    public Pets(String name) {
        super(name);
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getToys() {
        return toys;
    }

    public void setToys(String toys) {
        this.toys = toys;
    }




}
