package Classi.Comparator;

import Classi.Comparator.Persona;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Teoria_Comparator {

    /*
     * La classe Comparator in Java è un'interfaccia funzionale che viene utilizzata
     * per definire un ordine personalizzato tra gli oggetti di una classe. Viene
     * spesso utilizzata per ordinare le collezioni di oggetti in base a criteri
     * specifici.
     */

    public static void main(String[] args) {

        // Ordinamento con Comparator

        List<Persona> lp = new LinkedList<>();
        lp.add(new Persona("Paolo", "Bianchi", 25));
        lp.add(new Persona("Giuseppe", "Verdi", 21));
        lp.add(new Persona("Antonio", "Turchese", 19));
        lp.add(new Persona("Giuseppe", "Verdi", 89));

        // ORDINAMENTO PER ETA'
        Comparator.comparingInt(Persona::getEta);

        // Confronta gli oggetti Persona in base al valore dell'eta estratto. Di
        // conseguenza ordina gli oggetti Peronsa in base all'età in modo crescente

        Collections.sort(lp, Comparator.comparingInt(Persona::getEta)); // Ordina per eta in ordine crescente

        System.out.println(lp.toString()); // <19, 21, 25, 89>

        // ORDINAMENTO PER NOME

        Collections.sort(lp, Comparator.comparing(Persona::getNmome)); // Oridna per nome in ordine crescente

        System.out.println(lp.toString()); // <Antonio, Giusppe, Giuseppe, Paolo>

        //
        //

        // Ordinamento con compare()

        /*
         * L'interfaccia Comparator ha un unico metodo astratto chiamato compare(), che
         * accetta due argomenti dell'oggetto da confrontare e restituisce un valore
         * intero.
         * 
         * Il valore restituito dal metodo compare() può avere tre possibili risultati:
         * 
         * Un valore negativo se obj1 è minore di obj2.
         * Zero se obj1 è uguale a obj2.
         * Un valore positivo se obj1 è maggiore di obj2.
         */

        // Ordinamento per età

        Comparator<Persona> comp = new Comparator<>() {

            public int compare(Persona persona1, Persona persona2) { // restituisce un int

                return persona1.getEta() - persona2.getEta(); // 1
            }

        };

        Collections.sort(lp, comp);
        System.out.println(lp.toString()); // <19, 21, 25, 89>

        // Ordinamento per nome

        Comparator<Persona> nomeComparator = new Comparator<>() {

            public int compare(Persona p1, Persona p2) {
                return p1.getNmome().compareTo(p2.getNmome());
            }

        };

        Collections.sort(lp, nomeComparator);
        System.out.println(lp.toString()); // <Antonio, Giusppe, Giuseppe, Paolo>
    }

}
