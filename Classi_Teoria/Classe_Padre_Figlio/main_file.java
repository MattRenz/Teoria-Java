package Classi_Teoria.Classe_Padre_Figlio;

public class main_file {
    public static void main(String[] args) {

        Animale an1 = new Cane("Mario", 4, "Nero");

        if (an1 instanceof Cane) {
            System.out.println("Cane");
            an1.GetSuono();
        } else {
            System.out.println("Gatto");
            an1.GetSuono();
        }

        /*
         * Istanceof operatore che viene utilizzato per verificare se un oggetto è un
         * istanza di una determinata classe o no.
         * 
         * In questo caso Gatto e Cane sono figli della classe Animale, la classe
         * Animale è la super classe e on istanceof diciamo se è la classe cane, usa il
         * metodo per il cane, se è la classe gatto usa il metodo per la classe Gatto
         * 
         */
    }
}
