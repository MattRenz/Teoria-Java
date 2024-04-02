package Metodi;

import java.util.Arrays;
import java.util.List;

public class reduce {

    public static void main(String[] args) {

        /*
         * .reduce() in Java fa parte dell'interfaccia Stream del pacchetto
         * java.util.stream. Esso viene utilizzato per ridurre gli elementi di uno
         * stream a un unico valore applicando un'operazione specificata in modo
         * iterativo.
         */

        List<Integer> ln = Arrays.asList(1, 2, 3, 4, 5);

        // Eseguiamo la somma di ogni elmento della lista, la funzione:
        // (c,p) -> c+p viene applicata ad ogni elemento della lista:

        // 1+2 = 3, 3 + 3 = 6, 6 + 4 = 10, 10 + 5 = 15; Risultato 15;

        int v = ln.stream().reduce(0, (c, p) -> c + p);

        System.out.println(v);

        // L'uso di .reduce() è utile per calcolare somme, prodotti, trovare il massimo
        // o il minimo, concatenare stringhe, o eseguire qualsiasi operazione di
        // aggregazione sui dati presenti nello stream.
    }
}
