import java.io.FileReader;
import java.io.IOException;

public class LeggereDaFile {

    /*
     * La classe FileReader in Java è utilizzata per leggere caratteri da un file di
     * testo. È una classe specifica per la lettura dei caratteri e deriva dalla
     * classe astratta Reader. FileReader è particolarmente utile quando si desidera
     * leggere dati testuali da un file, come ad esempio un file di configurazione o
     * un file di testo semplice.
     */

    public static void main(String[] args) throws IOException {

        // Creazione ogg. file, con parametro il nome del file
        FileReader file = new FileReader("file.txt");

        file.read(); // Legge il carattere successivo dal flusso di input e lo restituisce come un
                     // valore intero. Restituisce -1 se si raggiunge la fine del file.

        file.close(); // chiude il flusso di input e rilascia tutte le risorse asscoaite ad esso

        // esempio di lettura di un file
        try (FileReader reader = new FileReader("pathFile")) {
            int character;
            while ((character = reader.read()) != -1) { // finchè non arriva alla fine legge
                System.out.print((char) character);
            }
        }
    }

    /*
     * NOTA IMPORTANTE
     * 
     * FileReader legge i dati come sequenze di caratteri, pertanto non è adatto per
     * leggere file binari o file che contengono dati non testuali. Per la lettura
     * di file binari, è consigliabile utilizzare la classe InputStream o
     * BufferedInputStream
     */
}
