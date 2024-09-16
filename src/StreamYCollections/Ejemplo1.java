package StreamYCollections;

/*
 * Este método permite crear un Stream con un unico elemento si el valor es nulo o Stream vacio si es nulo
 * */
import java.util.stream.Stream;

public class Ejemplo1 {
    public static void main(String[] args){
        String valor = null;

        Stream<String> stream = Stream.ofNullable(valor);
        //Utilizamos el metodo Stream.ofNullable el cual crear un stream con este valor

        stream.forEach(System.out::println);

    }
}
