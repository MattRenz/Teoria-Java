
public class string {
    public static void main(String[] args) {
        // Raccolta di caratteri chiusi tra virgolette

        String parola = "Hello";

        // Una stringa in realtà è un metodo che contiene metodi

        // mlengt() mostra la lunghezza di una stringa
        int lenStr = parola.length();
        System.out.println("La parola " + parola + " è lunga " + lenStr);

        // toUpperCase() rende tutto maiuscolo
        System.out.println(parola.toUpperCase());

        // toLowerCase() rende tutto minuscolo
        System.out.println(parola.toLowerCase());

        // indexOf()
        /*
         * restituisce l'indice (la posizione) della prima occorrenza
         * di un testo (spazi inclusi)
         */

        String frase = "Ciao sto studiando Java ";
        System.out.println(frase.indexOf("Java"));

        // equals() Confronta due striinghe per verificare se sono uguali
        System.out.println(parola.equals("Hello")); // true

        // trim() Rimuove spazi bianchi all'inizio e alla fine della stringa
        System.out.println(parola.trim());

        // charAt Ottenere il carattere in una specifica posizione
        System.out.println(parola.charAt(1));

        // .contains() controlla se una stringa contiene un carattere specifico
        System.out.println(parola.contains("Hel")); // ture
        System.out.println(parola.contains("e")); // true
        System.out.println(parola.contains("z")); // false

        // valueOf() restiuisce il valore primitivo di una stringa

        // .substring() estrae i caratteri compresi tra due indici (posizioni)
        System.out.println(parola.substring(0, 2));

        // --------------------------------------------------------------------------------

        // .matches() (== import re .py)

        /*
         * metodo dell'oggetto String che consente di verificare se una stringa
         * corrisponde ad un'espressione regolare (simile a import re su python)
         * Questo metodo restituisce un valore booleano che indica se la stringa
         * corrisponde all'espressione regolare o meno.
         * 
         * return true or false
         */

        String str = "12345";
        if (str.matches("\\d+")) {
            System.out.println("La stringa contiene solo cifre numeriche.");
        } else {
            System.out.println("La stringa contiene caratteri non numerici.");
        }

        /*
         * \d qualisiasi cifra numerica
         * "\w": corrisponde a qualsiasi carattere alfanumerico, ovvero una cifra
         * numerica, una lettera maiuscola o minuscola o il carattere underscore (_).
         * "\s": corrisponde a qualsiasi carattere di spaziatura, come lo spazio, il
         * tabulatore, il ritorno a capo, ecc.
         * "\D": corrisponde a qualsiasi carattere non numerico.
         * "\W": corrisponde a qualsiasi carattere non alfanumerico.
         * "\S": corrisponde a qualsiasi carattere non di spaziatura.
         * ".": corrisponde a qualsiasi carattere.
         * 
         * {} le parentesi graffe indicano la quantita di numeri tipo \d{3} corrisponde
         * a 3 cifre (di qualisis numero)
         * [aeioun] qualsiasi vocale o cosi via
         */

        // --------------------------------------------------------------------------------

        // String.format()

        /*
         * consente di creare stringhe formattate utilizzando specifici pattern di
         * formattazione. Il metodo String.format() utilizza il linguaggio di
         * formattazione di stringhe di Java (simile a quello di C) per specificare come
         * i dati devono essere formattati all'interno della stringa risultante.
         */

        String name = "Matteo";
        int age = 20;
        String message = String.format("Il mio nome è %s e la mia età è di %d anni.", name, age);
        System.out.println(message); // Output: Il mio nome è Matteo e la mia età è di 20 anni

        // Altri pattern di formattazione:

        /*
         * %s: Sostituisce il segnaposto con una stringa.
         * %d: Sostituisce il segnaposto con un numero intero decimale.
         * %f: Sostituisce il segnaposto con un numero in virgola mobile
         * %c: Sostituisce il segnaposto con un singolo carattere.
         * %b: Sostituisce il segnaposto con un valore booleano ("true" o "false").
         * 
         * %t: Sostituisce il segnaposto con una data/ora formattata. Richiede un
         * carattere di conversione aggiuntivo per specificare il tipo di formattazione,
         * ad esempio %td per il giorno del mese.
         * 
         * 
         */

        // --------------------------------------------------------------------------------

        // Formattazione stringa

        /*
         * \n: rappresenta un carattere di nuova linea.
         * \t: rappresenta un carattere di tabulazione(tab).
         * \b: rappresenta un carattere di retrocesso (backspace).
         * \r: rappresenta un carattere di ritorno a capo (carriage return).
         * \f: rappresenta un carattere di avanzamento pagina (form feed).
         */

    }
}
