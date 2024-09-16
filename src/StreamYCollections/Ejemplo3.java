package StreamYCollections;
/*
* El método dropwhile() ignora los elementos mientras se cumpla una condición y toma los elementos restantes
* */
import java.util.List;
public class Ejemplo3 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        numeros.stream()
                .dropWhile(n -> n < 5)
                .forEach(System.out::println);
    }
}
