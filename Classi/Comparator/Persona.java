package Classi.Comparator;

class Persona {

    String nome;
    String cognome;
    int eta;

    public Persona(String n, String c, int e) {
        this.nome = n;
        this.cognome = c;
        this.eta = e;
    }

    int getEta() {
        return eta;
    }

    String getNmome() {
        return nome;
    }

    public String toString() {
        return String.format("%s, %s, %d", nome, cognome, eta);
    }
}