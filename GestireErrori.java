import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GestireErrori {
    static public void main(String[] args) /* throws IOException */ {
        /*
         * Leggere una sequenza di numeri, uno per riga, dal terminale
         * e, quando sarà digitata una riga vuota, stampare la somma dei numeri letti
         */

        // devo calcolare la somma dei numeri digitati

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // gestisce la tastiera in modo
                                                                                  // flessibile

        // classe // istanza classe

        System.console().readLine(); // per leggere da terminale, direttamente dalla console

        // se in java mi chiamo una funzione che ptorebbe andare in errore, il programma
        // non compila

        // Gestire l'erore:

        /*
         * 1) Modo
         * Programma padre di queta funzione se arriva un errore
         * la fa paasare verso l'altro: throws IOException. In caso io non gli
         * dico di gestire questo erroe br.readline() andrà in errore perchè il
         * programma non gestisce l'errore
         */

        // br.readLine();

        /*
         * 2) Modo
         * con il try e il catch, prova a fare il programma
         * se non funziona, se va in errore esegui qualcosa,
         * il programma non va in crash
         */

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
        try {
            br.readLine();
        } catch (Exception ex) {
            System.out.println("Errore: " + ex.toString());
        }

        /* 3) Modo */
        // Troviamo noi l'errore
        // if (somma < 0) {
        // throw new Exception("Sei andto in errore");
        // }

    }
}
