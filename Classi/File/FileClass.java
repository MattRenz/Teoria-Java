
import java.io.File;
import java.io.IOException;

public class FileClass {

    /*
     * In Java, la classe "File" viene utilizzata per rappresentare e manipolare
     * informazioni sui file e sulle directory presenti nel sistema operativo.
     * Fornisce un'astrazione per le operazioni di base sui file, consentendo agli
     * sviluppatori di creare, leggere, scrivere, rinominare e eliminare file e
     * directory.
     */

    public static void main(String[] args) throws IOException {

        File oggFile = new File("pathName");

        oggFile.exists(); // restituisce true se il file o la directory esistono altrimenti false

        oggFile.isDirectory(); // restituisce true se è una directory

        oggFile.isFile(); // restituise ture se è un file

        oggFile.getName(); // restituisce il nome del file o della dircetory

        oggFile.getPath(); // restituisce il percorso assoluto del file o della directory

        oggFile.createNewFile(); // Crea un nuovo file nel percorso specificato, restituisce true se l'ha creato
                                 // corretamente

        oggFile.mkdir(); // Crea una nuova directory nel percorso specificato

        oggFile.delete(); // elimina il fle o la directory

        oggFile.renameTo(new File("newName")); // Rinomina il file o la directory

        File[] listFiles = oggFile.listFiles(); // Restituisce un array di oggetti File che rappresentano i file
                                                // all'interno di una directory

        String[] listStrings = oggFile.list(); // Restituisce un array di stringhe che contiene i nomi dei file e delle
                                               // directory all'internno di una directoy specificata

    }

}
