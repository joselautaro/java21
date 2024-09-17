package SequencedColecctions;

/*
* Eliminar el primer y último elemento
* */
import java.util.SequencedSet;
import java.util.LinkedHashSet;

public class Ejemplo4 {
    public static void main(String[] args) {
        SequencedSet<String> secuencia = new LinkedHashSet<>();

        secuencia.add("A");
        secuencia.add("B");
        secuencia.add("C");

        //Imprimimos antes de eliminar elementos
        System.out.println("Antes de eliminar: " + secuencia);

        secuencia.remove(secuencia.getFirst());
        secuencia.remove(secuencia.getLast());

        System.out.println("Después de eliminar: " + secuencia);
    }
}
