package PatternsSwitch;



public class Ejemplo4 {
    public static void main(String[] args) {
        Object objeto = 15;

        switch(objeto){

            //Si el objeto es Integer y su valor es mayor que 10, ejecutará esta linea
            /*
            Uso del when: en lugar de usar un patrón, con una condición en el case, usamos el when para añadir una condición adicional a un patrón
            * */

            case Integer i when i > 10 -> System.out.println("Es un entero mayor que 10");

            case Integer i -> System.out.println("Es un entero");

            case String s -> System.out.println("Es una cadena");

            default -> System.out.println("Tipo desconocido");

        }
    }
}
