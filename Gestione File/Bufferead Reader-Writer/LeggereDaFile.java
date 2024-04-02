import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeggereDaFile {

    /*
     * La classe BufferedReader in Java è utilizzata per leggere i dati da
     * un'origine di input, come ad esempio un file o un flusso di dati. Essa
     * fornisce una lettura efficiente dei caratteri, grazie all'utilizzo di un
     * buffer interno.
     */

    public static void main(String[] args) throws IOException {

        // creiamo l'ogg fileReader che ha come parametro il path del file
        FileReader fileReader = new FileReader("nomeFile");

        // creiamo l'ogg bufferedReader che ha come parametro l'ogg fileReader
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            bufferedReader.readLine(); // Legge una linea del file

            bufferedReader.read(); // Legge il carattere letto come un intero

            bufferedReader.close(); // Chiude il file

        }

    }
}
