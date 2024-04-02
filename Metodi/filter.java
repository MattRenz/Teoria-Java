package Metodi;

import java.util.Arrays;
import java.util.List;

public class filter {

    public static void main(String[] args) {

        /*
         * Viene utilizzato per filtrare gli elementi di uno stream in base a una
         * condizione specificata e restituire un nuovo stream contenente solo gli
         * elementi che soddisfano tale condizione.
         * 
         * A differenza di .map() non va a creare un nuovo flusso, ma modifica quello
         * che gli forniamo
         */

        List<Integer> ln = Arrays.asList(340, 560, 99, 123, 45, 12);

        // Prendiamo dalla lista solo i numeri che sono sotto il 100

        List<Integer> ln_min100 = ln.stream().filter(n -> n < 100).toList();

        System.out.println(ln_min100); // [99, 45, 12]
        System.out.println(ln); // [340, 560, 99, 123, 45, 12]

        /*
         * Quando si utilizza il metodo .filter(), si ottiene un nuovo stream che
         * contiene solo gli elementi che soddisfano la condizione specificata. Non
         * viene creata una nuova lista.
         */

    }
}
