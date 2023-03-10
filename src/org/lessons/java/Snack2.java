package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

//Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
public class Snack2 {
    public static void main(String[] args) {
        String[] surnames = { "Tulipano", "Gratta", "Bonuccia", "Fasullo", "Ligresti"};
        String[] names = {"Franco", "Marco", "Laura", "Marina"};

        Random randomizer = new Random();

        int numberOfGuests = 10;
        String[] guest = new String[numberOfGuests];

        for (int i = 0; i < guest.length ; i++){
            int randomNames = randomizer.nextInt(names.length);
            int randomSurnames = randomizer.nextInt(surnames.length);
            String completeName = surnames[randomSurnames] + " " + names[randomNames];
            guest[i] = completeName;
        }

        System.out.println(Arrays.toString(guest));
    }
}
