package PatternsSwitch;

/*
* Proposito: manejar una variable de tipo int con varios casos posibles
* */

public class Ejemplo1 {
    public static void main(String[] args) {
        int numero = 2;

        //Iniciamos el switch para evaluar el valor de la varible 2

        switch( numero ){
            //Si numero es igual a 1, se ejecuta esta linea
            case 1 -> System.out.println("Número uno");
            //Si numero es igual a 2, se ejecuta esta linea
            case 2 -> System.out.println("Número dos");
            //Si número de igual a 3, se ejecuta esta linea
            case 3 -> System.out.println("Número tres");
            //Si número no es niguno de los anteriores
            default -> System.out.println("Número desconocido");

        }
    }
}
