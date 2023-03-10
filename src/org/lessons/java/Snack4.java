package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

/*Crea due array che hanno un numero di elementi diversi. Mostra a video dei nuovi elementi random finchè il numero
di elementi presenti nell’array che ne ha di meno + quelli mostrati a video non è uguale al numero di elementi presenti nell’array che ne ha di più*/
public class Snack4 {
    public static void main(String[] args) {

        int[] longerArray = {1, 2, 3, 4, 5, 6};
        int[] shorterArray = {1, 2, 3};

        System.out.println("First array: " + Arrays.toString(longerArray));

        Random randomizer = new Random();

        System.out.print("Second array with random numbers: ");

        for (int i = 0; i < longerArray.length; i++) {
                int randomNumba = randomizer.nextInt(10);
            if (i < shorterArray.length){
                System.out.print(shorterArray[i] + " ");
            } else {
                System.out.print(randomNumba + " ");
            }
        }
    }
}