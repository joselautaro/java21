package StreamYCollections;
/*
* Stream.of: crear un stream a partir de una lista de elementos y .filter() permite seleccionar elementos basados en una condicion
* */
import java.util.stream.Stream;
public class Ejemplo5 {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("Juan", "Pedro", "Lauta");

        //Filtrar el stream para quedarnos solo con los nombres de 4 letras
        nombres.filter(nombre -> nombre.length() > 4)
                .forEach(System.out::println);
    }
}
