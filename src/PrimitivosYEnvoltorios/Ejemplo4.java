package PrimitivosYEnvoltorios;

//Uso de Optional con int y Integer
import java.util.Optional;

public class Ejemplo4 {
    public static void main(String[] args) {
        //Crear un Optional con un valor envoltorio Integer
        Optional<Integer> valorOpcional = Optional.of(100);



        //Usar Optional para obtener el valor y realizar una operacion
        int resultado = valorOpcional
                .map(valor -> valor *2) //Convertir el valor de Integer a int y multiplicar
                .orElse(0); //Valor por defecto si el Optional está vacio
        //Imprimimos el resultado
        System.out.println(STR."El resultado es: \{resultado}");
    }
}
