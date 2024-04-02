import java.util.Arrays;

public class array {
    public static void main(String[] args) {

        /*
         * In Java, un array è una struttura dati che rappresenta una collezione
         * ordinata di elementi dello stesso tipo. Gli array in Java hanno una
         * dimensione fissa, che viene specificata al momento della creazione dell'array
         * e non può essere modificata successivamente. Ecco alcune caratteristiche
         * degli array in Java:
         */

        // creazione Array interi di lunghezza 10
        int[] v1 = new int[10];

        // creazione di un Array con parametri già impostati
        // String[] v2 = { "Primo", "Secondo" };

        // array per inserire più valori in una singola varaibile

        // per dichiarare un array inserire il tipo di variabile con parentesi quadre

        String[] arrayStringhe = { "JAVA", "PYTHON", "HTML", "CSS" };

        int[] arrayNumeri = { 20, 70, 45, 40 };

        // Accedere a un singolo elemento di un array
        System.out.println(arrayStringhe[1]);

        // Modificare un elemento di un array
        arrayNumeri[0] = 15;
        System.out.println(arrayNumeri[0]);

        // Lunnghezza array length
        System.out.println(arrayStringhe.length);

        // Loop in un array
        for (int i = 0; i < arrayStringhe.length; i++) {
            System.out.println(arrayStringhe[i]);
        }

        // Un altro modo di vedere gli elementi di un array senza for
        for (int i : arrayNumeri) {
            System.out.println(i);
        }

        // ordinare Array in ordine crescente
        Arrays.sort(v1);
        Arrays.toString(v1);
    }
}
