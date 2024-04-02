package Classi_Teoria;

public class Persona {

    /*
     * 1)
     * Aggiungere gli attriuti della classe (le variabili di istanza) che descrivono
     * le caratteristiche delle persone
     */

    private String nome; // private impedisce l'accesso diretto alle vraibili
    private String cognome;
    private int eta;
    private String indirizzo;

    /*
     * 2)
     * Definire il costruttore della classe. Verrà utilizzato per crreare nuovi
     * oggeti di tipo Persona
     */

    // this. è per fariferimento all'oggeto corrente di tipo persona
    public Persona(String nome, String cognome, int eta, String indirizzo) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.indirizzo = indirizzo;
    }

    /*
     * 3)
     * Aggiungere i metodi ala classe, metodi che consentono di eseguire le
     * operazioni sulla classe o su i suoi oggetti. Ad esempio un metodo per
     * ottenere il nome della persona
     */

    public String getNome() {
        return nome;
    }

    public String getCognome() { // string perchè il tipo di ritorno è intero
        return cognome;
    }

    public int getEta() { // int perchè il tipo di ritorno è intero
        return eta;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void SchedaPersona() { // non ha un tipo di ritorno specificato (nessun return)
        System.out.println("Nome: " + getNome());
        System.out.println("Cognome: " + getCognome());
        System.out.println("Eta: " + getEta());
        System.out.println("Indirizzo: " + getIndirizzo());
    }

    public void ControllaSeMaggiorenne() {
        if (getEta() > 18) {
            System.out.println(getNome() + " è maggiorenne");
        } else {
            System.out.println(getNome() + " è minorenne");
        }
    }
}
