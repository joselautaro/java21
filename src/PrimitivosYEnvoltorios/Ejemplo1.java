package PrimitivosYEnvoltorios;

//Uso de int y Integer

import java.util.ArrayList;
import java.util.List;

public class Ejemplo1 {
    public static void main(String[] args) {
        List<Integer> listaDeEnteros = new ArrayList<>();

        listaDeEnteros.add(1);
        listaDeEnteros.add(2);
        listaDeEnteros.add(3);

        //Iterar sobre los lista y sumar los elementos
        int suma = 0;

        for(Integer numero : listaDeEnteros) {
            suma += numero;
        }

        //Imprimir la suma
        System.out.println(STR."La suma de los elementos es:  \{suma}");
    }
}
