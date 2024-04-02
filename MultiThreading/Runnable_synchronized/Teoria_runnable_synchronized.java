package Runnable_synchronized;

class Counter implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                count++;
                System.out.println("Thread: " + Thread.currentThread().getName() + ", Count: " + count);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Teoria_runnable_synchronized {

    /*
     * Quando si lavora con thread concorrenti in Java, può essere necessario
     * sincronizzare l'accesso a risorse condivise per evitare inconsistenze e
     * condizioni di race. L'interfaccia Runnable può essere utilizzata in
     * combinazione con la parola chiave synchronized per creare blocchi di codice
     * sincronizzati.
     */

    /*
     * La parola chiave synchronized viene utilizzata per creare sezioni di codice
     * che possono essere eseguite solo da un thread alla volta. Questo meccanismo
     * di sincronizzazione garantisce l'accesso esclusivo a una risorsa condivisa e
     * previene situazioni in cui più thread cercano di modificarla
     * contemporaneamente, causando inconsistente o errato stato dei dati.
     */

    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(counter);
        Thread thread2 = new Thread(counter);

        thread1.start();
        thread2.start();
    }

    /*
     * In questo esempio, la classe Counter implementa Runnable e contiene un
     * contatore count come risorsa condivisa. All'interno del metodo run(), il
     * blocco di codice sincronizzato synchronized (this) assicura che solo un
     * thread alla volta possa accedere a quel blocco di codice. In questo caso,
     * solo uno dei due thread (thread1 o thread2) può incrementare il contatore
     * count e stamparne il valore alla volta.
     */

    /*
     * Quindi prima abbiamo:
     * 
     * Thread: Thread-0, Count: 1
     * Thread: Thread-0, Count: 2
     * Thread: Thread-0, Count: 3
     * Thread: Thread-0, Count: 4
     * Thread: Thread-0, Count: 5
     * 
     * E solo successivamente:
     * Thread: Thread-1, Count: 6
     * Thread: Thread-1, Count: 7
     * Thread: Thread-1, Count: 8
     * Thread: Thread-1, Count: 9
     * Thread: Thread-1, Count: 10
     */

    /*
     * In questo modoè accessibilie un thread alla volta
     */

}
