class MioThread implements Runnable {
    public void run() {
        System.out.println("Ciao dalla classe MioThread");
    }
}

class MioThread1 extends Thread {
    public void run() {
        System.out.println("Ciao dalla classe MioThread1");
    }
}

public class thread_vs_runnable {

    public static void main(String[] args) throws Exception {

        Runnable mioth = new Runnable() {
            public void run() {
                System.out.println("Ciao");
            }
        };
        for (int i = 0; i < 1; i++) {

            // Gli oggetti che implementano Runnable possono essere
            // eseguiti direttamente nel codice (ovviamente non sono thread)
            mioth.run();

            // Diventano thread quando li assegno a una new di un thread
            Thread tmp = new Thread(mioth);
            tmp.start();

            // Gli oggetti che implementano Runnable possono essere
            // eseguiti direttamente nel codice (ovviamente non sono thread)
            MioThread tmp1 = new MioThread();
            tmp1.run();
            // Diventano thread quando li assegno a una new di un thread
            Thread th = new Thread(tmp1);
            th.start();

            // Gli oggetti/classi che estendono la classe thread,
            // non possono essere eseguiti se non come thread
            MioThread1 tmp2 = new MioThread1();
            tmp2.start();
        }

        // Differenze:

        /*
         * THREAD
         * Thread è una classe in Java che può essere estesa per creare un nuovo thread.
         * Estendendo Thread, è necessario sovrascrivere il metodo run(), che
         * rappresenta il codice da eseguire all'interno del thread. Quando si crea
         * un'istanza della classe estesa da Thread e si avvia il thread con il metodo
         * start(), viene eseguito il codice definito nel metodo run().
         * 
         * sovrasrive il metodo run()
         * si avia con il metodo start()
         */

        /*
         * RUNNABLEE
         * 
         * D'altra parte, Runnable è un'interfaccia funzionale in Java che definisce un
         * singolo metodo run(). Per creare un thread utilizzando Runnable, è possibile
         * implementare l'interfaccia e passare un'istanza di Runnable a un oggetto
         * Thread. Il thread quindi eseguirà il codice definito nel metodo run()
         * dell'istanza di Runnable. L'utilizzo di Runnable permette una maggiore
         * flessibilità, poiché una classe può implementare Runnable senza dover
         * estendere la classe Thread, consentendo così l'ereditarietà di altre classi.
         * 
         * definisce un sinoglo metodo run()
         * passa da istanza Runnable a ogg. Thread
         */
    }
}
