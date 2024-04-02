import java.io.IOException;

public class try_catch {

    /*
     * Il try-catch gestisce le eccezzioni.
     * Un eccezzione è u ngoggeto che rappresenta un'evenienza anomala che si
     * verifica durante l'esecuzione del programma
     */

    public static void main(String[] args) throws IOException {
        // try {
        // // Qui dentro va il codice che potrebbe generare un'eccezzione

        // // Nel caso il codice sollevi un eccezzione nel blocco try

        // // il codice viene subito interrotto e passa al blocco catch
        // }
        // catch (IOException ex) {

        // // Codice di gestione delll'eccezzione di TipoEccezzione1
        // }

        // ESEMPIO:

        int[] v = { 1, 2, 3 };

        try {

            System.out.println(v[4]); // In questo caso il programma prova a eseguire il codice, se non è possibile
                                      // entra nella condizione di catch

        } catch (ArrayIndexOutOfBoundsException e) { // L'eccesione è "ArrayIndexOutOfBoundsException" ovvero se il
                                                     // numero che ho fornito come indice non è valido

            System.out.println("Errore nell'indice"); // esegui questa istruzione
        }
    }

    /*
     * Eccezzzioni più comuni:
     * 
     * ArithmeticException:
     * Viene sollevata quando si verifica un errore aritmetico,
     * 
     * NullPointerException:
     * Viene sollevata quando si tenta di utilizzare un riferimento a un oggetto che
     * è null, cioè non è stato ancora inizializzato.
     * 
     * ArrayIndexOutOfBoundsException:
     * Viene sollevata quando si cerca di accedere a un elemento di un array con un
     * indice non valido
     * 
     * FileNotFoundException:
     * Viene sollevata quando si tenta di aprire un file che non esiste o quando si
     * accede a un file che non può essere aperto in lettura o scrittura.
     * 
     * IOException:
     * È una classe generica per le eccezioni di input/output. Viene sollevata
     * quando si verifica un errore durante le operazioni di lettura o scrittura di
     * dati.
     * 
     * IllegalArgumentException:
     * Viene sollevata quando viene passato un argomento non valido a un metodo, ad
     * esempio un valore fuori dal range accettabile.
     * 
     */
}