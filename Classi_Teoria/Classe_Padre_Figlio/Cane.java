package Classi_Teoria.Classe_Padre_Figlio;

public class Cane extends Animale {

    String colore;

    // Con extends dichiariamo che Cane è un estenzione della classe Animale
    public Cane(String nome, int eta, String colore) { // Qui ci sono gli attributi della classe Cane (figlio)
        super(nome, eta, "bau"); // Qui quelli della classe figlio (Cane)
        // In questo caso quando chiamiamo la classe Cane l'attributo suono è già
        // definito, quindi non c'è bisogno del costruttore

        // Differente se vogliamo invece creare un nuovo attributo nella classe Cane, in
        // quel caso dobbiamo usare il costruttore:
        this.colore = colore;

        // e aggiungere colore dentro il costruttore della classe Cane, e ovviamente no
        // dentro la super essendo la classe padre
    }

    public void GetSuonoCane() {
        System.out.println(suono);
    }
}
