package PatternsSwitch;

/*
* Identificar el tipo y valor de un variable de tipo object
* */

public class Ejemplo3 {
    public static void main(String[] args) {

        //Definimos una variable de object
        Object objeto = "Texto";

        switch(objeto){
            //Si objeto es un Integer, se asigna a i y se ejecuta esta linea
            case Integer i -> System.out.println("Es un entero con valor de: " + i);
            //Si objeto es un String, se asigna a s y se ejecuta esta linea
            case String s -> System.out.println("Es un cadena con valor de: " + s);
            //Si objeto es un Double, se asigna a d y se ejecuta esta linea
            case Double d -> System.out.println("Es un doble con valor de: " + d);
            //Si objeto es un Float, se asigna a f y se ejecuta esta linea
            case Float f -> System.out.println("Es un Flotante con valor de: " + f);
            default -> System.out.println("Es un entero con valor de: " + objeto);
        }
    }
}
