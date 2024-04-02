package Classi.Random;

import java.util.Random;

import java.security.SecureRandom;

public class Teoria_Random {
    public static void main(String[] args) {

        // RANDOM

        Random random = new Random();

        // Genera un numero casuale compreso tra 0 e 9
        int randomNumber = random.nextInt(10);
        System.out.println("Numero casuale: " + randomNumber);

        // Genera un numero casuale compreso tra 1 e 100
        int randomInRange = random.nextInt(100) + 1;
        System.out.println("Numero casuale nell'intervallo: " + randomInRange);

        // Genera un numero casuale a virgola mobile compreso tra 0.0 e 1.0
        double randomDouble = random.nextDouble();
        System.out.println("Numero casuale a virgola mobile: " + randomDouble);

        // SECURERANDOM

        SecureRandom secureRandom = new SecureRandom();

        // Genera un numero casuale compreso tra 0 e 9
        int SecurerandomNumber = secureRandom.nextInt(10);
        System.out.println("Numero casuale: " + SecurerandomNumber);

        // Genera un numero casuale compreso tra 1 e 100
        int SecurerandomInRange = secureRandom.nextInt(100) + 1;
        System.out.println("Numero casuale nell'intervallo: " + SecurerandomInRange);

        // Genera un numero casuale a virgola mobile compreso tra 0.0 e 1.0
        double SecurerandomDouble = secureRandom.nextDouble();
        System.out.println("Numero casuale a virgola mobile: " + SecurerandomDouble);
    }

    /*
     * La classe SecureRandom utilizza un algoritmo crittograficamente sicuro per la
     * generazione di numeri casuali ed è consigliata quando si hanno esigenze di
     * sicurezza.
     */

}
