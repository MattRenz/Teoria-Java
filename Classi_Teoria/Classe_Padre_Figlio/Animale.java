package Classi_Teoria.Classe_Padre_Figlio;

public class Animale {

    String nome;
    int eta;
    String suono;

    public Animale(String nome, int eta, String suono) {

        this.nome = nome;
        this.eta = eta;
        this.suono = suono;
    }

    public void GetSuono() {
        System.out.println(suono);
    }

}
