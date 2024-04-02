package Runnable;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Codice da eseguire all'interno del thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Esecuzione del thread: " + i);
            try {
                Thread.sleep(1000); // Sospende l'esecuzione per 1 secondo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}