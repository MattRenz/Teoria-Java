package Metodi;

import java.util.*;

public class forEach {

    public static void main(String[] args) {

        /*
         * L'interfaccia Stream<T> definisce il metodo forEach(Consumer<? super T>
         * action), che accetta un oggetto Consumer come parametro. Il Consumer
         * rappresenta un'operazione da eseguire su ciascun elemento dello stream.
         * 
         * Consente di eseguire un'azione specificata su ciascun elemento dello stream.
         */

        List<String> nomi = Arrays.asList("Marco", "Luca", "Andrea");

        nomi.stream()
                .forEach(nomi_ -> System.out.println("Ciao " + nomi_));

        // output: Ciao Marco
        // Ciao Luca
        // Ciao Andrea

    }

}
