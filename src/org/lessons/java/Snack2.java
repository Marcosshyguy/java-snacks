package org.lessons.java;
//Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
public class Snack2 {
    public static void main(String[] args) {
        String[] surnames = { "Tulipano", "Gratta", "Bonuccia"};
        String[] names = {"Franco", "Marco", "Laura"};


        for (int i = 0; i < surnames.length && surnames.length == names.length ; i++){
            System.out.println(surnames[i] + " " + names[i]);
        }
    }
}
