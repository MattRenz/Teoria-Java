import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class inputUtente {
    public static void main(String[] args) throws IOException {

        System.console().readLine(); // consente di leggere una linea di testo inserita dall'utente dalla console.

        // BufferedReader

        // Altro modo tramite BufferedReader:
        /*
         * Creare un oggetto BufferReader che permette di leggere l'input inserito
         * dall'utente sulla console
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String riga = br.readLine(); // br.readLine è un metodo che legge la linea
        System.out.println(riga);

        // Scanner

        try (// Altro modo tramite Scanner
                Scanner input = new Scanner(System.in)) {
            int num = input.nextInt(); /// legge il prossimo numero intero dalla console
            System.out.println(num);
            double numDouble = input.nextDouble(); // legge il prossimo numero double dalla console
            System.out.println(numDouble);
            String str = input.nextLine(); // Legge la prossima linea di testo dalla console
            System.out.println(str);
        }

        /*
         * È importante notare che Scanner è meno efficiente di BufferedReader, quindi
         * se si prevede di leggere grandi quantità di input, potrebbe essere meglio
         * utilizzare BufferedReader.
         */

    }

}