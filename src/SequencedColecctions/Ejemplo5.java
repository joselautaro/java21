package SequencedColecctions;

/*
* Mostramos como iterar sobre un SequencedSet mientras mantenemos el orden de inserción
*
* */
import java.util.SequencedSet;
import java.util.LinkedHashSet;

public class Ejemplo5 {
    public static void main(String[] args) {
        SequencedSet<String> secuencia = new LinkedHashSet<>();

        secuencia.add("Manzana");
        secuencia.add("Banana");
        secuencia.add("Naranja");

        //Iterar sobre los elementos manteniendo el orden de inserción
        for(String fruta : secuencia) {
            System.out.println(fruta);
        }
    }
}
