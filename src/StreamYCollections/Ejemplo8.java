package StreamYCollections;
/*
Uso de Collectors.toList() para recolectar
Permite recolectar elementos de un stream en una lista
* */
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Ejemplo8 {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("Brais", "Pablo", "Manuel");

        //Usamos Collectors.toList() para recolectar los elementos en una lista
        List<String> listaNombres = nombres.collect(Collectors.toList());
        System.out.println(listaNombres);
    }
}
