package Classi_Teoria;

public class polimofrismo {

    public static int Add(int n1, int n2) {
        return n1 + n2;
    }

    public static String Add(String s1, String s2) {

        return s1 + s2;
    }

    /*
     * Due classi per scopi diversi, una concatena le stringhe e una somma i numeri
     */

    public static void main(String[] args) {

        System.out.println(Add(1, 2));

        System.out.println(Add("Ciao", "ni"));

        /*
         * La prima print verrà eseguita come somma (3)
         * la seconda come concatena Ciaoni
         * 
         * Da notare che il nome della classe Add è uguale, quindi ina java si può usare
         * lo stesso nome della classe, ma con scopi diversi
         */

    }
}
