package org.campus02.animals;

import java.util.ArrayList;

public class DemoApp {
    public static void main(String[] args) {

        //Aufgabe 1:  Richtig? - denke schon;
        Frog quaxi = new Frog("Grün",2,"Quaxi");
        Animal quaxiAsAnimal = quaxi;
        Frog frogger = (Frog) quaxiAsAnimal;


        //Aufgabe 2:
        ArrayList<Animal> animals = new ArrayList<>();
        Nature nature = new Nature(animals);
        nature.addAnimal(quaxi);
        nature.addAnimal(new Cat("brown", 2, "Mimi"));
        nature.addAnimal(new Bird("Grün", 2, "birdy"));

        System.out.println(nature.countColor("Grün"));



        //Unterricht:
        Animal fritzi = new Cat("braun", 2, "fritzi");
        fritzi.makeNoise();
        fritzi.walk();

        Animal tweety = new Bird("gelb", 2 ,"tweety");
        tweety.makeNoise();
        tweety.walk();
        // tweety.fly();

        Flyable flyable = (Flyable) tweety;
        flyable.fly();

    }
}
