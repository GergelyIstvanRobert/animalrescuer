package org.fasttrackit;



 /* Hello world!
 *
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App
{
    public static void main( String[] args )
    {

        System.out.println( "Hello Animal Rescuer!" );



        Adopter adopterRefrence = new Adopter("Dan");
        adopterRefrence.setMoneyAvailable(100.1);

        Animal animalRefrence = new Animal("Kira");
        animalRefrence.setFavoriteFood("Meat");
        animalRefrence.setHealthLevel(9);
        animalRefrence.setHungerLevel(8);
        animalRefrence.setMoodLevel(10);
        animalRefrence.setNameFavoriteActivity("Running");
        animalRefrence.setAge(3);

        AnimalFood animalFoodRefrence;
        animalFoodRefrence = new AnimalFood("Pedigree");
        animalFoodRefrence.setAmount(10);
        animalFoodRefrence.setAvailableStock(true);
        animalFoodRefrence.setExpirationDate(LocalDateTime.now());
        animalFoodRefrence.setPrice(12.5);

        RecreationalActivity recreationalActivityRefrence = new RecreationalActivity("Running");


        Vet vetRefrence = new Vet("Help All");
        vetRefrence.setName("Doctor");


        System.out.println("Animal name:" + animalRefrence.getName());
        System.out.println("Animal  favortie food:" + animalRefrence.getFavoriteFood());
        System.out.println("Animal  favortie activity:" + animalRefrence.getNameFavoriteActivity());

        System.out.println("The Adopter name:" + adopterRefrence.getName());
        System.out.println("The Adopter money available:" + adopterRefrence.getMoneyAvailable());

        System.out.println("Animal food name:" + animalFoodRefrence.getName());
        System.out.println("Animal food expiration date:" + animalFoodRefrence.getExpirationDate());
        System.out.println("Animal food stock:" + animalFoodRefrence.isAvailableStock());

        System.out.println( "Recreational activity name:" + recreationalActivityRefrence.getName());

        System.out.println("Vet name:" + vetRefrence.getName());
        System.out.println("Vet specialization:" + vetRefrence.getSpecialization());
        adopterRefrence.AdopterFeedAnimal("Kira","Pedigree");













    }
}
