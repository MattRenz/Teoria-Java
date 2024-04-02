package Thread;

/*
 * In Java, i thread sono utilizzati per eseguire operazioni concorrenti o
 * parallele. Un thread rappresenta un singolo flusso di esecuzione all'interno
 * di un programma Java. Puoi pensare ai thread come ad "esecutori" separati che
 * possono essere avviati e gestiti dal programma principale.
 */

// Classe MyThread (creata da noi) con estenzione di Thread
class MyThread_t extends Thread {

    @Override
    public void run() {

        try {
            // Codice eseguito in un thread separato
            System.out.println("Esecuzione del thread");

            // Meotdi Thread
            Thread.sleep(100); // Sospende l'esecuzione di un thread per un certo periodo di tempo

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public MyThread_t() {
        // Costruttore MyThread nel quale è possibile implementare dati
    }
}

public class MyThread_teoria {

    public static void main(String[] args) throws InterruptedException {

        MyThread_t myThread = new MyThread_t(); // Creazione ogg. MyThread

        myThread.start(); // Avvia il thread

        // Meotdi Thread
        myThread.join(); // attende che un Thread termini la sua esecuzione

        myThread.interrupt(); // interrompe l'esecuzione di un thread. Quando viene chiamato

    }

}
