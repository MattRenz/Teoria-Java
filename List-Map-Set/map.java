import java.util.Map;
import java.util.TreeMap;

public class map {
    public static void main(String[] args) {

        /*
         * Map ha lo stesso principio del dizionario di Java accetta una coppia
         * chiave-valore. Le implicaizoni comuni possono esssere
         * HashMap,TreeMap,LinkedHashMap
         */

        /*
         * HashMap:
         * - Non garentisce un ordine specifico delle chiavi durante l'iterazione
         * - Non consente chiavi duplicate, se si prvoa a scrivere una chiave già
         * inserita il valore verrà sovrascritto
         * 
         * TreeMap:
         * - Mantiene le chiavi ordinate in base al loro ordine naturale
         */

        Map<String, Integer> dizionarioSI = new TreeMap<>();

        dizionarioSI.put("Voto1", 27); // inserisce una coppia chiave valore
        dizionarioSI.put("Voto2", 29);

        dizionarioSI.size(); // Restisuice la grandezza del dizionario

        dizionarioSI.isEmpty(); // Restituisce true se è vuoto altrimenti false

        dizionarioSI.containsValue(27); // Restituisce true se il dizionario contiene quel valore

        dizionarioSI.containsKey("Voto3"); // Restituisce true se il dizionario contienre la chiave

        dizionarioSI.get("Voto1"); // Restituisce il valore della chiave specificata

        dizionarioSI.clear(); // Rimuove tutte le coppie chiave valore

        dizionarioSI.remove("Voto2"); // Rimuove la chiave specificata

        dizionarioSI.keySet(); // Restituisce un 'Set' contenente tutte le chiavi presenti nel dizionario

        dizionarioSI.values(); // Restituisce una 'Collection' contenente tutti i valori del dizionario

    }
}
