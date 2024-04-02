package Metodi;

import java.util.*;

public class Funzioni_lambda {

    public static void main(String[] args) {

        // Forniscono un modo conciso per esprimere funzioni anonime, consentendo di
        // scrivere codice più leggibile e ridotto.

        /*
         * Sintassi delle funzioni lambda: Una funzione lambda è costituita da
         * parametri, una freccia -> e un corpo. La sintassi generale è la seguente:
         * 
         * (parametri) -> corpo
         * 
         * Spesso le funzioni lambda sono utilizzate con metodi come .map() .filter() .
         * reduce()
         */

        List<Integer> li = Arrays.asList(3, 2, 6, 5, 8, 7, 9, 1, 3, 2, 5, 9, 0);

        // Restituisci una lista con tutti i valori minori di 6

        // Sisntassi lambda estesa
        List<Integer> limod = li.stream().filter(
                (Integer v) -> {
                    return v < 6;

                }).toList();

        System.out.println(limod);

        // Sintassi lambda semplificata
        List<Integer> limods = li.stream().filter(v -> v < 6).toList();

        System.out.println(limods);
    }

    /*
     * Le funzioni lambda sono un potente strumento che rende Java più espressivo e
     * flessibile nella scrittura del codice. Consentono di scrivere codice più
     * conciso, eliminando la necessità di dichiarare classi anonime per funzioni
     * semplici.
     */
}
