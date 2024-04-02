
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SalvareSuFile {

    /*
     * La classe BufferedWriter in Java è una classe che fornisce un meccanismo
     * efficiente per scrivere testo in un flusso di output, ad esempio un file.
     * Questa classe estende la classe astratta Writer e fornisce un buffer interno
     * che consente di ridurre le operazioni di I/O sul disco.
     */

    public static void main(String[] args) throws IOException {

        // creiamo l'ogg. writer, a cui passeremo FileWriter(nomeFile)

        // possiamo chiamre il file come vogliamo se invece di specificare il nome del
        // file specifichiamo il path + il nome del file con cui vorremmo chiamre il
        // file, in questo modo va a creare un file nuovo con il nome che noi gli
        // abbiamo fornito

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))) {

            writer.write("Contenuto file"); // scrive sul file
            writer.write(5);

            writer.newLine(); // scrive una nuova riga nel buffer interno

            writer.flush(); // garantisce che i dati vengano scritti immediatamente

            writer.close(); // chiusura del file

        }

        // Altro modo sarebbe stato quello di creare prima l'ogg. FileWriter e poi
        // l'ogg. BufferedWriter. Come riportato qui sotto:

        /*
         * FileWriter file = new FileWriter("file.txt");
         * BufferedWriter writer = new BufferedWriter(file);
         */

    }

}
