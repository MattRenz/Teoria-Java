package Serializzazione;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Class_ObjectOutputStream {

    /*
     * ObjectOutputStream è una classe in Java che consente di scrivere oggetti su
     * uno stream di output. Questo stream può essere un file, una connessione di
     * rete o un altro tipo di flusso di output.
     * 
     * Per utilizzare ObjectOutputStream, è necessario creare un'istanza di questa
     * classe e associarla a uno stream di output. Ad esempio, se si desidera
     * scrivere oggetti su un file, è possibile utilizzare un FileOutputStream per
     * creare il flusso di output e passarlo al costruttore di ObjectOutputStream.
     */

    public static void main(String[] args) {

        // Esempio Scrittura:

        try {
            // Crea un FileOutputStream per il file di output
            FileOutputStream fileOut = new FileOutputStream("output.dat");

            // Crea un ObjectOutputStream associato al FileOutputStream
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

            MyObject obj = new MyObject(); // Oggetto da scrivere

            objOut.writeObject(obj); // Scrive l'oggetto sullo stream

            objOut.writeBoolean(true); // Scrive un valore booleano sullo stream

            objOut.writeFloat(0); // Scrive un valore float sullo stream

            objOut.close(); // Chiude l'ObjectOutputStream

            System.out.println("Oggetto scritto con successo.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}