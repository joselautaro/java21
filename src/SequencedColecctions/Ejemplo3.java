package SequencedColecctions;

import java.util.SequencedSet;
import java.util.LinkedHashSet;


public class Ejemplo3 {
    public static void main(String[] args) {
        //Creamos un SequecedSet con el orden de inserción
        SequencedSet<Integer> secuencia = new LinkedHashSet<>();
        secuencia.add(10);
        secuencia.add(20);
        secuencia.add(30);

        //Imprimimos el primer y el ultimo elemento
        System.out.println(secuencia.getFirst());
        System.out.println(secuencia.getLast());

    }
}
