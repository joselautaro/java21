package SequencedColecctions;
/*
* Uso de SequencedMap
* Es un mapa ordenado que garantiza el orden de inserción de las clases y permite el acceso al primer y ultimo clave valor
* */
import java.util.SequencedMap;
import java.util.LinkedHashMap;

public class Ejemplo2 {
    public static void main(String[] args) {
        //Creamos un SequencedMap usando el LinkedHashMap  para garantizar el orden de inserción
        SequencedMap<Integer, String> mapa = new LinkedHashMap<>();

        //Añadimos algunos pares clave valor
        mapa.put(1, "Uno");
        mapa.put(2, "Dos");
        mapa.put(3, "Tres");

        //Obtenemos y mostramos el primer par clave valor

        System.out.println("Primer par: " + mapa.get(2));

        //Obtenemos y mostramos el último
        System.out.println("Último par: " + mapa.lastEntry());
    }
}
