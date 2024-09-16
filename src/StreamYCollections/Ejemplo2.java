package StreamYCollections;
/*
* El método takewhile(), toma los elementos de un stream mientras se cumple una condicion. Una vez que la condición deja de cumplirse, se detiene
* */
import java.util.List;
public class Ejemplo2 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numeros.stream()
                .takeWhile(n -> n < 5)
                .forEach(System.out::println);
    }
}
