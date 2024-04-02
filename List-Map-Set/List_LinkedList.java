import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class List_LinkedList {

    /*
     * Creare liste:
     * 
     * List<T> ...Arrays.asList();
     * List<T> ...Arrays.List<>();
     * LinkedList<T> ...LinkedList<>();
     */

    public static void main(String[] args) {

        // ARRAYLIST

        /*
         * List in java rappresenta una sequenza ordinata di elementi. Definisce un
         * insieme di operazioni di base per manipolare ed accedere agli elementi della
         * lista. Molto simili alle liste Python
         */

        // Creare una lista di stringhe
        List<String> ListaStringhe = new ArrayList<>();

        // Creare una lista di interi
        List<Integer> ListaInteri = new ArrayList<>();

        // Metodi per manipolare la lista

        ListaStringhe.add("Java"); // aggiunge alla fine

        ListaInteri.addAll(Arrays.asList(1, 2, 3)); // aggigunge più elementi insieme

        ListaStringhe.add(0, "Studio"); // aggiunge ad una posizione specifica

        ListaStringhe.remove(0); // Rimuove l'elemento selezionato

        System.out.println(ListaStringhe.get(0)); // Restituisce l'elemento all'indice selezionato

        System.out.println(ListaStringhe.size()); // Restituisce la grandezza della lista

        System.out.println(ListaInteri.isEmpty()); // Restituisce true se la lista è vuota altrimenti false

        ListaStringhe.clear(); // Cancella tutti gli elementi

        // LINKEDLIST

        /*
         * LinkedList in Javaè una struttura dati che rappresenta una sequenza di
         * elementi, dove ogni elemento è collegato al successivo attraverso un
         * riferimento. A differenza di un'array, una LinkedList non richiede uno spazio
         * contiguo in memoria per memorizzare gli elementi, ma utilizza nodi che
         * puntano all'elemento successivo nella sequenza.
         */

        // Creareare una LinkedList di stringhe
        LinkedList<String> myList = new LinkedList<>();

        // Oppure:
        LinkedList<Integer> myList2 = new LinkedList<>();

        myList2.addAll(Arrays.asList(new Integer[] { 5, 6, 8, 7, 9, 1 })); // Aggiunge più elementi alla lista

        myList.add("Elemento1"); // Aggiunge 1 elemento alla lista

        myList2.get(0); // Restituisce l'elemnto specificato <5>

        myList2.remove(1); // Rimuove l'elemento all'indice specificato dalla LinkedList. <6>

        myList.size(); // Restituisce il numero di elementi presenti nella LinkedList. <1>

        myList.isEmpty(); // Verifica se la lista è vuota false / true

        myList2.contains(1); // Verifica se la LinkedList contiene l'elemento specificato. true / false

        myList.clear(); // Rimuove tutti gli elementi dalla LinkedList.

        myList2.toArray(); // Restituisce un array contenente tutti gli elementi della LinkedList.

        myList.iterator(); // Restituisce un iteratore per attraversare la LinkedList.

        myList.addFirst("Elemento per primo"); // Aggiunge l'elemento specificato all'inizio della LinkedList.

        myList.addLast("Elemento per ultimo"); // Aggiunge l'elemento specificato alla fine della LinkedList.

        myList.getFirst(); // Restituisce il primo elemento della LinkedList.

        myList.getLast(); // Restituisce l'ultimo elemento della LinkedList.

        myList.removeFirst(); // Rimuove e restituisce il primo elemento della LinkedList.

        myList.removeLast(); // Rimuove e restituisce l'ultimo elemento della LinkedList.

        myList2.peek(); // Restituisce il primo elemento della LinkedList senza rimuoverlo.

        myList2.peekFirst(); // Restituisce il primo elemento della LinkedList senza rimuoverlo.

        myList2.peekLast(); // Restituisce l'ultimo elemento della LinkedList senza rimuoverlo.

    }
}