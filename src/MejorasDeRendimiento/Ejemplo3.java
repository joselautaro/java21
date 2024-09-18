package MejorasDeRendimiento;

//Mejora en la clase Stream

import java.util.stream.IntStream; //Permite trabajar con flujos de enteros primitivos

import java.util.List;

public class Ejemplo3 {

    public static void main(String[] args) {

        //Creamos una lista de numeros enteros usando InsStream que genera numeros del 1 al 999.999
        //La llamada .boxed() convierte cada int primitivo a su equivalente integer
        //Luego de convierte el flujo a una lista con toList()

        List<Integer> numeros = IntStream.range(1, 999999).boxed().toList();

        //Utiliza un stream paralelo para mejorar el rendimiento en grandes conjuntos de datos
        //La operacion parallelStream() permite que el stream se procese en multiples hilos

        long cuentaPares = numeros.parallelStream()
                //Filtra los numeros que son pares, utilizando un lamba (n -> n % 2 == 0) para quedarnos solo con aquellos que al dividirse por dos, no tienen residuos
                .filter(n -> n % 2 == 0)
                //Cuenta cuantos numeros pares hay en la lista
                .count();
        System.out.println("Cantidad de numeros pared: " + cuentaPares);

    }


}
