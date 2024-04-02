
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {

        /*
         * I Set rappresentano una collezzione di elementi unici, che non si ripetono
         * tra di loro, ogni elemento compare al massimo una vota soltanto.
         * Implementazioni comuni sono HasSet TreeSet
         * 
         * HasSet: (Non ordinato)
         * TreeSet: (Ordinato)
         */

        Set<Integer> set = new TreeSet<>(); // Set di interi
        Set<Integer> set2 = new TreeSet<>();

        set.add(20); // Aggiunta elemento al Set
        set.add(10);
        set.add(15);
        set2.add(20);
        set2.add(10);
        set2.add(40);

        set.size(); // restituisce la grandezza del Set

        set.isEmpty(); // Restituisce true se è vuoto altrimenti false

        set.remove(20); // Rimuove il vaore specificato

        set.retainAll(set2); // Vengono mantenuti solo gli elementi presenti nel set 1 e nel set 2 (solo 10)

        set.clear(); // Rimuove tutti i valori
    }
}
