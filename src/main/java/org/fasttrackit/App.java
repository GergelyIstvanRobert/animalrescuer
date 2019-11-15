package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello Animal Rescuer!" );
        Adopter adopterRefrence = new Adopter();
        adopterRefrence.name = "Dan";
        adopterRefrence.moneyAvailable = 100.1;

        Animal animalRefrence = new Animal();
        animalRefrence.favoriteFood = "Meat";
        animalRefrence.healthLevel = 9;
        animalRefrence.hungerLevel = 8;
        animalRefrence.moodLevel = 10;
        animalRefrence.name = "Kira";
        animalRefrence.nameFavoriteActivity = "Running";

        AnimalFood animalFoodRefrence = new AnimalFood();
        animalFoodRefrence.amount = 10;
        animalFoodRefrence.availablestock = 10;
        animalFoodRefrence.expirationDate ="2019,12,01";
        animalFoodRefrence.name = "Pedigre";
        animalFoodRefrence.price = 12.5;

        RecreationalActivity recreationalActivityRefrence = new RecreationalActivity();
        recreationalActivityRefrence.name="Running";

        Vet vetRefrence = new Vet();
        vetRefrence.name = "Doctor";
        vetRefrence.specialization = "Help All";

        System.out.println("Animal name:" + animalRefrence.name);
        System.out.println("Animal  favortie food:" + animalRefrence.favoriteFood);
        System.out.println("Animal  favortie activity:" + animalRefrence.nameFavoriteActivity);

        System.out.println("The Adopter name:" + adopterRefrence.name);
        System.out.println("The Adopter money available:" + adopterRefrence.moneyAvailable);

        System.out.println("Animal food name:" + animalFoodRefrence.name);
        System.out.println("Animal food expiration date:" + animalFoodRefrence.expirationDate);

        System.out.println( "Recreational activity name:" + recreationalActivityRefrence.name);

        System.out.println("Vet name:" + vetRefrence.name);
        System.out.println("Vet specialization:" + vetRefrence.specialization);












    }
}
