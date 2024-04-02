package Iteratori;

import java.util.ArrayList;
import java.util.Iterator;

public class Teoria_iteratori {
    /*
     * In Java, gli iteratori sono oggetti che consentono di scorrere e accedere
     * agli elementi di una collezione in modo sequenziale. Forniscono
     * un'interfaccia unificata per attraversare i contenuti di una struttura dati,
     * come ad esempio un array o una lista, senza dover conoscere i dettagli
     * interni della struttura stessa.
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Creazione iteratore:

        Iterator<Integer> iterator = list.iterator();

        iterator.next(); // restituisce l'elemento successivo nella sequenza e sposta l'iteratore avanti.

        iterator.hasNext(); // restituisce true se l'iteratore ha un elemento successivo, altrimenti false

        iterator.remove(); // Rimuove l'ultimo elemento restituito dall'iteratore dalla collezione
                           // sottostante

    }

}