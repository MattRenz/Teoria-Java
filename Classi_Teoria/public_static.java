package Classi_Teoria;

public class public_static {

    // static method
    /*
     * I metodi statici significa che è possibile accedervi senza creare un oggetto
     * della classe
     */
    static void FunzioneSalutaStatic() {
        System.out.println("Ciao!!");
    }

    static int Somma(int x) {
        return x + x;
    }

    // public method
    /*
     * E' possibile accedervi solo tramite oggetti
     */
    public void FunzioneSalutaMethod() {
        System.out.println("Ciao");
    }

    // ESEMPIO
    public void velocita(int maxSpeed) {
        System.out.println("Velocità massima: " + maxSpeed);
    }

    public void nomeAuto(String marca, String modello) {
        System.out.println("L'auto " + marca + " " + modello + ": ");
    }

    public static void main(String[] args) {

        // static method
        FunzioneSalutaStatic();

        // ststic method con return
        System.out.println(Somma(5));

        // public method
        public_static myObj = new public_static(); // andiamo a creare un oggetto di classi
        myObj.FunzioneSalutaMethod(); // chiamo il metodo public dall'oggetto che ho creato

        // ESEMPIO
        public_static myCar = new public_static();
        myCar.nomeAuto("Porsche", "GT3-RS");
        myCar.velocita(27);

    }

    /*
     * Quindi public / static
     * 
     * static: è un metodo di classe che appartiene alla classe stessa, anziché a
     * una istanza della classe. Ciò significa che può essere utilizzato senza dover
     * creare un oggetto
     * 
     * public:è un metodo che può essere accessibile da qualsiasi classe, ovunque
     * nel programma. Ad esempio, se si dichiara un metodo come public, qualsiasi
     * classe potrà chiamare quel metodo. E' possibile accedervi solo tramite
     * oggetti
     */
}