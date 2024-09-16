package StreamYCollections;
/*
Collectors.joining() funciona para concatenar strings
Permite concatenar todos los elementos de una cadena de string en una sola cadena de texto
* */

import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Ejemplo9 {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("Juan", "Pedro", "Maria");

        String nombresConcatenados = nombres.collect(Collectors.joining(", "));

        System.out.println(nombresConcatenados);
    }
}
