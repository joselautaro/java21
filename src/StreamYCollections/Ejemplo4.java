package StreamYCollections;
/*
* Stream.iterate() condicion de terminacion
* Este método permite generar un stream de elementos que sigue una regla y termina cuando se cumple una condicion
*
* */

import java.util.stream.Stream;
public class Ejemplo4 {
    public static void main(String[] args) {
    //Usamos el stream interate para generar una secuencia de numeros pares
        Stream.iterate(0, n -> n < 10, n -> n +2)
                .forEach(System.out::println);
    }
}
