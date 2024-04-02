package Runnable;

public class Teoria_runnable {
    public static void main(String[] args) {
        // Creazione di un'istanza di MyRunnable
        Runnable myRunnable = new MyRunnable();

        // Creazione di un nuovo thread e passaggio di MyRunnable
        Thread thread = new Thread(myRunnable);

        // Avvio del thread
        thread.start();

        // Codice da eseguire nel thread principale
        for (int i = 0; i < 5; i++) {
            System.out.println("Esecuzione del thread principale: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * In questo esempio, viene creata una classe MyRunnable che implementa
     * l'interfaccia Runnable. All'interno del metodo run(), viene definito il
     * codice da eseguire all'interno del thread. Nel metodo main(), viene creata
     * un'istanza di MyRunnable, che viene quindi passata a un oggetto Thread.
     * Successivamente, il thread viene avviato chiamando il metodo start(). Il
     * codice nel thread principale viene eseguito simultaneamente con il thread
     * creato, producendo un output intercalato.
     */

    /*
     * Implementando l'interfaccia Runnable, è possibile sfruttare l'ereditarietà
     * multipla in Java e fornire una maggiore flessibilità nella gestione dei
     * thread. Inoltre, consentendo l'implementazione di Runnable, è possibile
     * creare e avviare più thread utilizzando lo stesso codice, promuovendo la
     * riusabilità e la modularità del codice.
     */
}