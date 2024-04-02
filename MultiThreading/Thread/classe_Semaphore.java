package Thread;

/*
Un semaforo è un oggetto che tiene traccia del numero di permessi
disponibili e viene utilizzato per controllare l'accesso concorrente
a una risorsa.
 

La classe Semaphore fornisce due operazioni principali:
 
    acquire(): viene utilizzato per ACQUISIRE un permesso dal semaforo. 
    Se ci sono permessi disponibili, il thread può acquisirne uno e proseguire l'esecuzione. 
    Se non ci sono permessi disponibili, il thread si blocca fino a quando non diventa disponibile 
    almeno un permesso. 
     
    Questo metodo può generare un'eccezione InterruptedException se il thread viene interrotto durante il processo di attesa. 
     

    release(): viene utilizzato per RILASCIARE un permesso precedentemente acquisito e restituirlo al semaforo. 
    Dopo aver chiamato release(), il permesso diventa disponibile per altri thread che possono acquisirlo successivamente.
        
*/

import java.util.concurrent.Semaphore;

// Esempio Semaphore:

class MyThread extends Thread {

    String nome_t;
    Semaphore semaphore;

    // Costruttore
    public MyThread(String name_t, Semaphore semaphore) {
        this.nome_t = name_t;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i <= 5; i++) {

                semaphore.acquire(); // Concede permesso

                if (i == 0) {
                    System.out.println(nome_t + ": " + i); // Stampa nome del thread e valore
                    semaphore.release(); // Toglie permesso

                } else {
                    semaphore.release(); // Toglie permesso
                    Thread.sleep(100); // Aggiungi una breve pausa per garantire l'alternanza dei thread
                    semaphore.acquire(); // Riconcede permesso
                    System.out.println(nome_t + ": " + i); // Stampa
                    semaphore.release(); // Toglie permesso
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class classe_Semaphore {
    public static void main(String[] args) throws Exception {

        Semaphore semaphore = new Semaphore(1);

        MyThread t1 = new MyThread("Thread1", semaphore);
        t1.start();

        MyThread t2 = new MyThread("Thread2", semaphore);
        t2.start();

        /*
         * In questo modo i Thread andranno ad eseguirsi contempornaeamente
         * Grazie a sempahore che rilascia e toglie i permessi
         */
    }
}