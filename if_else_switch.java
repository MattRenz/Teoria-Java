
public class if_else_switch {
    public static void main(String[] args) {
        int MyAge = 25;
        int VotoinAge = 18;

        // if / else
        if (MyAge >= VotoinAge) {

            System.out.println("Puoi votare"); // istruzione/i

        } else {

            System.out.println("Non puoi votare");// istruzione/i
        }

        /*
         * if per specificare un blocco di codice da eseguire (se una condizione è vera)
         * else per specificare un blocco di codice da eseguire (se una condizione è
         * falsa)
         * else if per specificare una nuova condizione da testare, se la prima è falsa
         * switch per specificare molti blocchi alternativ di codice da eseguire
         */

        // Operatore TERNARIO
        // variabile = (condizione) ? esprezzioneTrue: espressioneFlase;
        String risultato = (MyAge > VotoinAge) ? "Puoi votare" : "Non puoi votare";
        System.out.println(risultato);

        /*
         * Invece di scrivere molte if else, possiamo usare la dichirazione switch
         * switch seleziona uno dei tanti blocchi da eseguire
         */

        int day = 8;
        switch (day) {
            case 1:
                System.out.println("Lunedì");
                break;
            case 2:
                System.out.println("Martedì");
                break;
            case 3:
                System.out.println("Mercoledì");
                break;
            case 4:
                System.out.println("Giovedì");

            case 5:
                System.out.println("Venerdì");
                break;
            case 6:
                System.out.println("Sabato");
                break;
            case 7:
                System.out.println("Domenica");
                break;
        }

        /*
         * break essce dal blocco switch
         * 
         * default specifica l'istruzione di codice da eseguire in caso non ci sia
         * nessuna corrispondenz
         */

    }

}
