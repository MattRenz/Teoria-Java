public class tipiDati {
    /*
     * Tipi di dati
     * Ci sono più tipi di dati, ognungo con una capienza e uso specifico
     * byte = 1 byte (8 bit) Numeri interi di piccolo valore da - 128 a 127
     * short = 2 bytes (16 bit) Numeri interi da -32.767 a 32.767
     * int = 4 bytes (32 bit) Numeri interi da -2.147.483.648 a 2.147.483.647
     * long = 8 bytes (64 bit) Numeri interi da -9.223.372.036.854.775.808 to
     * 9.223.372.036.854.775.807
     * float = 4 bytes (32 bit) Numeri decimali a virgola mobile
     * double = 8 bytes (64 bit) Numeri decimali a virgola mobile
     * boolean = true o false
     * String = stringa "ciao"
     * char = per singoli caratteri di tipo Unicode
     * caratteri (char) per assegnare un singolo carattere in java usiamo ''
     * 
     * 
     * Castig
     * Il casting è la conversione di un valore da un tipo di dato in un altro
     * 
     * Casting implicito: da un dato a un dato più grande:
     * int x = 10;
     * double y = x;
     * 
     * Castin esplicito: da un dato a un dato più piccolo:
     * double a = 2.75;
     * int b = (int) a
     */

    // enum

    enum Month {
        // rappresenta un insieme fisso di costanti nome-valore.
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY,
        AGUST, SEPTEMBR, OCTOBER, NOVEMBER, DICEMBER;
    }

    public static void main(String[] args) {

        Month november = Month.values()[10];
        System.out.println(november);

        // STRING FORMAT

        System.out.println(String.format("NUmero: %d", 5));

        /*
         * E' possibile formattare la stringa come vogliano specificando il tipo di dato
         * (%d) intero e l'argomento il numero (in questo caso)
         */

        Double num = 4.6;
        System.out.println(String.format("Numero: %f", num));

        // In questo esempio specifichiamo che è di tipo double con %f

        /*
         * Altri tipi sono:
         * %d: segnaposto per valori interi
         * %f: segnaposto per valori in virgola mobile
         * %s: segnaposto per stringhe
         * %c: segnaposto per caratteri
         * %b: segnaposto per valori booleani
         * %o: segnaposto per valori interi in base ottale
         * %x o %X: segnaposto per valori interi in base esadecimale
         * %e o %E: segnaposto per valori in virgola mobile in notazione scientifica
         */
    }

}
