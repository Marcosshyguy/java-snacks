package org.lessons.java;

import java.util.Scanner;

//Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
public class Snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Add a number: ");
        int num = Integer.parseInt(scan.nextLine());

        int finalNumber = num % 2 == 0 ? num : num + 1;

        System.out.println(finalNumber);
        scan.close();
    }
}
