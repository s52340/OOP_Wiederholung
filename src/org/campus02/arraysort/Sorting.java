package org.campus02.arraysort;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2}; //länge = 8


        Car[] cars = {new Car(2022,"blue", 2500),
                      new Car(1989,"brown", 1200),
                      new Car(2000, "silver", 1300)};

        arrangeOrder(cars);
        System.out.println(Arrays.toString(cars));
    }


    //Bubble sort - nach 1. Durchlauf größte Zahl an letzter Stelle!!! WICHTIG zu wissen!

    public static void arrangeOrder(Sortable[] numbers){

        for (int i = 0; i < numbers.length; i++){    //- NICHT GUT bei vielen werten! ist oke - aber schlechter algorithmus; 2 schleifen hintereinander gefährlich
            boolean changes = false;
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j].compareTo(numbers[j + 1]) > 0){
                    Sortable speicher = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j + 1] = speicher;
                    changes = true;
                }
            }
            if (changes == false){
                break;
            }
        }

    }



}
