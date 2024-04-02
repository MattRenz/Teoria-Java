import java.io.IOException;
import java.io.FileOutputStream;

public class SalvareSuFile {

    /*
     * FileOutputStream è una classe in Java che fornisce un modo per scrivere dati
     * in un file. Essa estende la classe astratta OutputStream e viene utilizzata
     * per creare un flusso di output di byte che può essere utilizzato per scrivere
     * dati in un file.
     * 
     * A differenza degli altri ANDIAMO A SCRIVERE UN FLUSSO OUTPUT DI BYTE
     */

    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("path/to/file.txt");

            file.write(65); // Scrive un singolo byte nel flusso di putput 65 = A

            byte[] data = "Hello, World!".getBytes(); // scrive un array di byte nel flusso di output
            file.write(data);

            file.close(); // Chiiude il flusso di output
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
