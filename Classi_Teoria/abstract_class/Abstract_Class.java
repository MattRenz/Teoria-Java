package Classi_Teoria.abstract_class;

/*
 * Le classi astratte forniscono un meccanismo per la creazione di gerarchie di classi, 
 * dove la classe astratta rappresenta un concetto generale o un'idea astratta che ha 
 * delle implementazioni concrete nelle sue classi derivate.
 */

// Dichiarazione classe astratta

public abstract class Abstract_Class {

    public abstract int calcolaSomma();

    public abstract int calcolaDifferenza();

    /*
     * 2 Metodi senza implementazione. Questi metodi astratti vengono utilizzati per
     * rappresentare un'idea GENERALE di calcolare la somma e la differenza di n
     * numeri, ma la loro implementazione specifica sarà lasciata alle classi
     * derivate.
     */

    // Possono anche esserci metodi di implementazioni concrete:

    public void StampaDescrizione() {
        System.out.println("Calcola somma e differenza di numeri");
    }
}

/*
 * Creata la classe astratta si deve creare una classe concreta che ESTENDA la
 * classe astratta e fornisca implementazione per tutti metodi astratti
 * dichiarati nella classe astratta.
 */

class Somma1 extends Abstract_Class {

    int num1;
    int num2;

    public Somma1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public int calcolaSomma() {
        return num1 + num2;
    }

    @Override
    public int calcolaDifferenza() {
        return num1 - num2;
    }

    /*
     * Le classi astratte sono utili per creare una struttura gerarchica delle
     * classi, consentendo di definire metodi comuni e garantendo che tutte le
     * classi derivate implementino tali metodi. Inoltre, le classi astratte possono
     * contenere variabili di istanza, costruttori, metodi con implementazioni
     * concrete e metodi statici.
     */
}
