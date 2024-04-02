package Metodi;

import java.util.*;

class Mia {
    public String nome;
    public String cognome;
    public int eta;

    public Mia(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d", nome, cognome, eta);
    }

    String getCognome() {
        return cognome;
    }

    int getEta() {
        return eta;
    }

    public class map_filter_reduce {

        public static void main(String[] args) {

            List<Integer> l = Arrays.asList(4, 5, 8, 3, 1, 9, 0);

            // MAIN

            /*
             * .map() fa parte dell'interfaccia Stream del pacchetto java.util.stream. Esso
             * viene utilizzato per trasformare un flusso di elementi applicando una
             * funzione a ciascun elemento e restituendo un nuovo flusso contenente i
             * risultati delle trasformazioni.
             */

            // Facciamo una lista che presi tutti gli elementi della lista
            // "l" li moltiplica per 2

            List<Integer> div_num = l.stream().map(n -> n * 2).toList();

            System.out.println(l); // Lissta originale (4, 5, 8, 3, 1, 9, 0)

            System.out.println(div_num); // Lista modificata (8, 10, 16, 6, 2, 18, 0)

            // E' possiible farlo anche sugli ogg.

            // Abbiamo creato una classe Mia, creiamo un ogg della classe mia

            List<Mia> lMia = Arrays.asList(
                    new Mia("Marco", "Rossi", 35),
                    new Mia("Andrea", "Palomino", 27),
                    new Mia("Luigi", "Caparotti", 33));

            // // Ora vogliamo modificare l'età di tutti gli ogg della classe Mia
            // // Aggiungendo 3 all'età di ogni ogg (Persona) dell'ogg lMia

            System.out.println(lMia); // Ogg normali [Marco, Rossi, 35, Andrea, Palomino, 27, Luigi, Caparotti, 33]

            List<Mia> leta = lMia.stream().map(
                    (Mia m) -> {
                        m.eta += 5; // il problema è che facendo così modifichiamo direttamente l'elemento della
                                    // lista
                        return m;

                    }).toList();

            System.out.println(leta); // Ogg modificati [Marco, Rossi, 40, Andrea, Palomino, 32, Luigi, Caparotti, 38]
            System.out.println(lMia); // Ogg normali (che ora sono modificati) [Marco, Rossi, 40, Andrea, Palomino,
                                      // 32, Luigi, Caparotti, 38] quindi non sono più quelli di prima

            // Quindi map prende ogni elemento di un flusso, e restituisce un nuovo flusso
            // modificato

        }

    }
}
