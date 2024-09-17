package SequencedColecctions;

import java.util.SequencedSet; //Importamos la interfaz SequencedSet
import java.util.LinkedHashSet; // Importamos el LinkedinHashSet que implementa el SequencedSet


public class Ejemplo1 {
    public static void main(String[] args) {
        SequencedSet<String> secuencia = new LinkedHashSet();
        //Añadimos algunos elementos al set
        secuencia.add("Primero");
        secuencia.add("Segundo");
        secuencia.add("Tercero");

        //Obtener y mostrar el primer elemento
        System.out.println("Primer elemento: " + secuencia.getFirst());

        //Obtener y mostrar el ultimo
        System.out.println("Último elemento: " + secuencia.getLast());

    }
}
