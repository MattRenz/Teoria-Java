package Classi.StringBuilder;

public class Teoria_StringBuilder {

    /*
     * La classe StringBuilder in Java viene utilizzata per creare e manipolare
     * stringhe in modo efficiente quando è necessaria la modifica frequente del
     * contenuto della stringa. A differenza della classe String, che è immutabile
     * (ovvero non può essere modificata dopo la creazione), StringBuilder offre
     * metodi che consentono di aggiungere, rimuovere o modificare il contenuto
     * della stringa senza creare nuove istanze.
     */

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(); // Creare un oggetto StringBuilder vuoto

        // StringBuilder sb = new StringBuilder("Hello");
        // Crea un oggetto StringBuilder con una stringa di inizializzazione

        // Metodi StringBuilder

        sb.append(" world"); // Aggiunge una stringa alla fine

        sb.insert(5, ","); // Inserisce una stringa in una posizione specifica

        sb.delete(5, 11); // Rimuove una porzione di stringa

        sb.replace(0, 5, "Hi"); // Sostituisce una porzione di stringa con un'altra

        sb.reverse(); // Inverte l'ordine dei caratteri nella stringa

        String result = sb.toString();
        System.out.println(result); // Output: iH

        // Altri metodi StringBuilder

        /*
         * length(): Restituisce la lunghezza della stringa.
         * 
         * capacity(): Restituisce la capacità corrente del buffer di StringBuilder.
         * 
         * charAt(int index): Restituisce il carattere corrispondente all'indice
         * specificato.
         * 
         * indexOf(String str): Restituisce l'indice della prima occorrenza della
         * stringa specificata.
         * 
         * lastIndexOf(String str): Restituisce l'indice dell'ultima occorrenza della
         * stringa specificata.
         * 
         * substring(int startIndex): Restituisce una sottostringa che inizia
         * dall'indice specificato fino alla fine della stringa.
         * 
         * substring(int startIndex, int endIndex): Restituisce una sottostringa che va
         * dall'indice startIndex all'indice endIndex-1.
         * 
         * replace(int startIndex, int endIndex, String str): Sostituisce una porzione
         * di stringa con la stringa specificata.
         * 
         * delete(int startIndex, int endIndex): Rimuove una porzione di stringa
         * dall'indice startIndex all'indice endIndex-1.
         * 
         * insert(int offset, String str): Inserisce una stringa in una posizione
         * specifica.
         * 
         * reverse(): Inverte l'ordine dei caratteri nella stringa.
         */

    }

}
