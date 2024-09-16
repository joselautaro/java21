package StreamYCollections;
/*
* Método Stream.reduce()
* Permite combinar todos los valores de un stream en un solo valor
* */
import java.util.stream.Stream;
public class Ejemplo7 {
    public static void main(String[] args) {
        Stream<String> texto = Stream.of("Juan", "Lauta", "Mary");
        Stream<Integer> numeros = Stream.of(1, 2, 3);
        //Usamos el reduce para sumar todos los numeros en el stream
        //Inicializamos la acumulación en 0, para luego sumar cada numero al acumulador
        String suma = texto.reduce(" ", (a, b) -> a + " - " +  b);
        int suma2 = numeros.reduce(0, (a, b) -> a + b);

        System.out.println(suma);
        System.out.println(suma2);
    }
}
