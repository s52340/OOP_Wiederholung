package org.campus02.animals;

import java.util.ArrayList;

public class Nature {
    private ArrayList<Animal> animalArrayList;

    public Nature(ArrayList<Animal> animalArrayList) {
        this.animalArrayList = animalArrayList;
    }

    public void addAnimal(Animal animal) {
        animalArrayList.add(animal);
    }

    public int countColor(String color) {
        int count = 0;
        for (Animal a : animalArrayList) {
            if (a.getColor().equals(color)) {
                count = count + 1;
            }
        }
        return count;
    }

}
