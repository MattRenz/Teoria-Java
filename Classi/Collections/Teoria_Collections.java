package Classi.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Teoria_Collections {

    /*
     * Il framework java.util.Collections fornisce un'ampia gamma di metodi statici
     * per manipolare e operare sulle collezioni in Java. Ecco una panoramica dei
     * principali metodi offerti da questa classe:
     */

    public static void main(String[] args) {

        // Creiamo una collezione
        List<Integer> l = new ArrayList<>();
        l.addAll(Arrays.asList(new Integer[] { 50, 10, 22, 5, 33 }));

        Collections.reverse(l); // Inverte l'ordine degli elementi nella lista.
        // <[33, 5, 22, 10, 50]>

        Collections.sort(l); // Ordina gli elementi della lista in ordine crescente
        // <[5, 10, 22, 33, 50]>

        Collections.shuffle(l); // Mescola casualmente gli elementi nella lista.

        Collections.fill(l, 0); // Sostituisce tutti gli elementi nella lista con l'oggetto specificato.
        // <[0, 0, 0, 0, 0]>

        List<Integer> lCopy = new ArrayList<>();
        Collections.copy(l, lCopy); // Copia tutti gli elementi dalla lista di origine alla lista di destinazione.

        Collections.replaceAll(l, 0, 100); // Sostituisce tutte le occorrenze di un valore specifico con un nuovo valore
        // <[100, 100, 100, 100, 100]>

        Collections.max(l); // Restituisce l'elemento massimo nella collezione

        Collections.min(l); // Restituisce l'elemento minimo nella collezione

    }
}
