package PrimitivosYEnvoltorios;

//Uso de Stream con long y Long
import java.util.Arrays;
import java.util.List;
//import java.util.Optional;

public class Ejemplo5 {
    public static void main(String[] args) {

        List<Long> listaDeLargos = Arrays.asList(100L, 200L, 300L);

        //PROBAR CON OPTIONAL

//        Optional<Long> suma = Optional.of(listaDeLargos);
//                suma.map(x -> x.forEach(suma )
//                .reduce(Long::sum);
//        suma.ifPresentOrElse(
//                valor -> System.out.println("La suma de los valores es: " + valor),
//                () -> System.out.println("La lista está vacia o no hay valores para sumar")
//        );
        //Usar Stream para calcular la suma
        long suma = listaDeLargos.stream()
                .mapToLong(Long::longValue) //Convertir Long a long
                .sum(); //Sumar los valores



        System.out.println(STR."La suma de los valores es: \{suma}");

    }

}
