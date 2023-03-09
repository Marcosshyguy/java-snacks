package org.lessons.java;

import java.util.Random;

//Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
public class Snack2 {
    public static void main(String[] args) {
        String[] surnames = { "Tulipano", "Gratta", "Bonuccia", "Fasullo", "Ligresti"};
        String[] names = {"Franco", "Marco", "Laura", "Marina"};

        Random randomizer = new Random();


        for (int i = 0; i < 10 ; i++){
            int randomNames = randomizer.nextInt(names.length-1 );
            int randomSurnames = randomizer.nextInt(surnames.length-1);
            System.out.println(surnames[randomSurnames] + " " + names[randomNames]);
        }
    }
}
