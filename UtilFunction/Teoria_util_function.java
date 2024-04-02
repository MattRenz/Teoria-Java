package UtilFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Teoria_util_function {

    /*
     * Il pacchetto java.util.function di Java fornisce un insieme di
     * interfacce funzionali che vengono comunemente utilizzate
     * quando si lavora con la programmazione funzionale e le
     * espressioni lambda. Queste interfacce sono progettate per
     * rappresentare vari tipi di funzioni o operazioni e consentono di
     * passare i comportamenti come argomenti o di assegnarli a
     * variabili
     */

    // ------------------------------------------------------------------------------------------

    // SUPPLIER
    /*
     * Non richiede alcun input
     * Restituisce un risultato di tipo T.
     * In altre parole, un Supplier è un
     * fornitore di dati che genera o restituisce un valore.
     */

    // per richiamare: <T>.get()

    public static void main(String[] args) {

        // Stampa stirnga casuale da 1 a 10
        Supplier<String> randomStringSupplier = () -> {
            String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 10; i++) {
                int randomIndex = (int) (Math.random() * alfabeto.length());
                sb.append(alfabeto.charAt(randomIndex));
            }
            return sb.toString();
        };

        String randomString = randomStringSupplier.get();

        System.out.println(randomString);

        // ------------------------------------------------------------------------------------------

        // CONSUMER

        /*
         * accetta un singolo argomento <T>
         * Non restituisce alcun risultato
         * 
         * ha un singolo metodo astratto chiamato accept(T t), che prende un parametro
         * di tipo T e non restituisce nulla. Può essere utilizzata per eseguire
         * un'azione o elaborare un valore di input senza restituire alcun risultato.
         */

        // void accept(T t);

        Consumer<String> printInUpperCase = (String str) -> {
            String upperCaseStr = str.toUpperCase();
            System.out.println(upperCaseStr);
        };

        printInUpperCase.accept("hello");

        // ------------------------------------------------------------------------------------------

        // PREDICATE

        /*
         * accetta un tipo di dato e ritorna ture o false
         * 
         * ha un singolo metodo astratto chiamato test(T t), che prende un parametro di
         * tipo T e restituisce un valore booleano. Può essere utilizzata per definire
         * una condizione che viene applicata all'input per determinare se è vero o
         * falso.
         */

        // boolean test(T t);

        Predicate<Integer> intpred = (Integer n) -> {
            return n < 6; // torna false se minore di 6
        };

        System.out.println(intpred.test(10)); // false

        // ------------------------------------------------------------------------------------------

        // FUNCTION

        /*
         * Accetta un valore di tipo <T>
         * Restituisce un valore di tipo <R>
         * trasforma l'elemento
         */

        // R apply(T t);

        List<Integer> li = Arrays.asList(20, 30, 40, 50, 60, 70, 80);

        Function<Integer, String> inttostr = (Integer v) -> {
            return "<" + v.toString() + ">";
        };

        System.out.println(li.stream().map(inttostr).toList());
        // Trasforma tutti i numeri della lista li in stringhe

        // ------------------------------------------------------------------------------------------

        // OPERATORE UNITARIO

        /*
         * accetta un input di tipo T
         * restituisce un output dello stesso tipo
         * 
         * elabora un valore di input e produce un risultato dello stesso tipo.
         */

        // T apply(T t);

        // Funzione che esegue la moltiplicazione per 2 di un numero
        UnaryOperator<Integer> doubleNumber = (Integer number) -> number * 2;

        // accetta in ingresso un intero e ritorna un intero

        Integer result = doubleNumber.apply(5);

        System.out.println(result); // Output: 10

        // ------------------------------------------------------------------------------------------

        // BinaryOperator prende 2 valori dello stesso tipo e torna 1 intero

        // BiFunction <T, U, R> // 2 tipi diversi in ingresso e torna un altro tipo

        // BiCOnsumer <T, U> prende 2 valori di tipo diverso e non restituisce niente

    }
}
