package Serializzazione;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializzazione {

    /*
     * la serializzazione è il processo di trasformazione di un oggetto in una
     * sequenza di byte, che può quindi essere memorizzata su un supporto di
     * archiviazione o trasmessa attraverso una rete. Questo processo consente di
     * salvare lo stato degli oggetti e ripristinarlo in un secondo momento,
     * consentendo la persistenza dei dati e la comunicazione tra diverse
     * applicazioni.
     * 
     * Per eseguire la serializzazione in Java, è necessario che la classe
     * dell'oggetto da serializzare implementi l'interfaccia Serializable
     */

    // ESEMPIO:

    public static void main(String[] args) throws IOException {

        /*
         * PER USARE LA SERIALIZZAZIONE DI UN OGGETTO E' POSSIBILE UTILIZZARE LA CLASSE:
         * ObjectOutputStream
         */

        Persona p1 = new Persona("Alice", 20);

        FileOutputStream file = new FileOutputStream("nameFile.txt");
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(p1);
        // Scrive l'oggetto serializzato nel file
        out.close();
        file.close();
        System.out.println("Oggetto serializzato correttamente.");
    }
}