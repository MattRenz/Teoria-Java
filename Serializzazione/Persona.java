package Serializzazione;

import java.io.Serializable;

public class Persona implements Serializable {

    // implementa l'interfaccia Serializable, il che indica che gli oggetti di
    // questa classe possono essere serializzati.

    public static final String GetName = null;
    private String name;
    private int age;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String GetName() {
        return name;
    }

    public int GetAge() {
        return age;
    }

}
