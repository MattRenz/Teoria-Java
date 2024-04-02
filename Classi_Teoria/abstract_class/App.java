package Classi_Teoria.abstract_class;

public class App {

    public static void main(String[] args) {

        Somma1 somma = new Somma1(5, 5);

        System.out.println(somma.calcolaSomma()); // <10>

        System.out.println(somma.calcolaDifferenza()); // <0>
    }
}
