package org.lessons.java;
//Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
public class Snack3 {
    public static void main(String[] args) {
    int [] arrayNumber = {1,4,5,12,7,10,2,14,10};
    int sum = 0;
        for (int i = 0; i < arrayNumber.length; i++){
            int printNumber = i % 2 != 0 ?  0 : arrayNumber[i];
            sum += printNumber;
        }
        System.out.println(sum);
    }

}
