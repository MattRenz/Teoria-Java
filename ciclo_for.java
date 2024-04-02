
public class ciclo_for {
    public static void main(String[] args) {

        // Quando si sa quante volte si vuole eseguire un codice si usa for

        /*
         * for (istruzione 1, istruzione 2, istruzione 3){
         * // codice da eseguire
         * }
         * 
         * istruzione 1 = viene eseguita prima del'esecuzione del ciclo (1 volta)
         * istruzione 2 = definisce la condizione per l'esecuzione del blocco
         * istruzione 3 = viene eseguita in loop dopo che il codice è stato eseguito
         */

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // Scorrere elememti in un array
        String[] cars = { "Audi", "Porsche", "BMV" };

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
