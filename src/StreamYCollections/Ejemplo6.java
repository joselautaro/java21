package StreamYCollections;

/*
* Stream.map: transforma elementos de un stream de una forma a otra
* */
import java.util.stream.Stream;

public class Ejemplo6 {
    public static void main(String[] args) {
        Stream<Integer> numeros = Stream.of(1, 2, 3);

        //Usamos map para multiplicar cada numero por 2
        numeros.map(n -> n *2)
                .forEach(System.out::println);
    }
}
