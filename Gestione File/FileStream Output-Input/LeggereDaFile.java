import java.io.*;

public class LeggereDaFile {

    /*
     * FileInputStream è una classe fornita dal linguaggio di programmazione Java
     * che consente di leggere dati da un file in modo sequenziale. Fa parte del
     * package java.io e fornisce una serie di metodi per la lettura dei dati da un
     * file.
     */

    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("input.txt");

            file.close(); // Chiude il FileInputStream quando non è più necessario

            file.read(); // Legge un singolo byte dallo stream di input e lo restituisce come un valore
                         // compreso tra 0 e 255. Se raggiunge la fine del file, restituisce -1.

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
