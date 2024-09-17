package SequencedColecctions;

/*
* Modificar el primer y último elemento en una secuencia
* */

import java.util.SequencedSet;
import java.util.LinkedHashSet;

public class Ejemplo6 {
    public static void main(String[] args) {
        SequencedSet<String> secuencia = new LinkedHashSet<>();

        secuencia.add("X");
        secuencia.add("Y");
        secuencia.add("Z");

        secuencia.remove(secuencia.getFirst());
        secuencia.addFirst(("Nuevo primero"));

        secuencia.remove(secuencia.getLast());
        secuencia.add("Nuevo último");

        System.out.println("Set modificado: " + secuencia);
    }
}
