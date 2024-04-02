package Classi_Teoria;

public class mainPersona {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Matteo", "Rossi", 20, "Via Roma 25");
        Persona persona2 = new Persona("Martina", "Bianchi", 17, "Piazza dante 1");

        persona1.SchedaPersona();
        persona1.ControllaSeMaggiorenne();
        System.out.println(" ");
        persona2.SchedaPersona();
        persona2.ControllaSeMaggiorenne();

    }
}
