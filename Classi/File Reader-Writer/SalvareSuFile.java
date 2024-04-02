import java.io.FileWriter;
import java.io.IOException;

public class SalvareSuFile {

    // salvare una stringa su file
    public static void Save(FileWriter file, String str) throws IOException {
        file.write(str);
    }

    // salvare un intero su file
    public static void SaveInt(FileWriter file, int num) throws IOException {
        file.write(Integer.toString(num)); // intero salvato sotto forma di stringa

    }

    // salvare un float su file
    public static void SaveFloat(FileWriter file, Float num) throws IOException {
        file.write(Double.toString(num));

    }

    public static void main(String[] args) throws IOException {

        // Creazione ogg. file, con parametro il path del file
        FileWriter file = new FileWriter("file.txt");

        SaveInt(file, 11);
        Save(file, "prova");

        // file è l'oggetto della classe FileWriter

        file.close();

        file.write(""); // Scrivi sul file

        file.append("aggiungi"); // Aggiunge un singolo carattere alla fine dell file

        // chiudere il file alla fine del processo

    }
}