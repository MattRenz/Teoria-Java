package Classi.Math;

public class math {
    public static void main(String[] args) {

        // La classe Java Mth ha metodi che sonsentono di eseguire calcoli matematici su
        // numeri

        int num1 = 5;
        int num2 = -3;

        // Math.max() massimo tra due numeri
        System.out.println((Math.max(num1, num2)));

        // Math.min() minimo tra due numeri
        System.out.println(Math.min(num1, num2));

        // Math.sqrt() radice quadrata di un numero
        System.out.println(Math.sqrt(num1));

        // Math.abs() restituisce il valroe assoluto (positivo)
        System.out.println(Math.abs(num2));

        // Math.random() numero casuale compreso tra 0.0 (incluso) e 1.0 (escluso)
        Math.random();

        // Per ottenre il controllo di un numero casuale
        int randomNum = (int) (Math.random() * 101);
        System.out.println(randomNum);
    }
}
