package RecordsMejorados;

/*
* Explicación global: Este bloque de código define un record de Persona que tiene dos atributos, nombre y edad. Luego se crea una instancia de Persona y vamos a imprimir los valores
* */

public class Ejemplo1 {
    //Definimos un record de Persona que encapsula dos componentes, String para el nombre y un int para la edad
    //Un record es una nueva forma de definir clases en java y que sirve para modelar datos inmutables
    //Automaticamente se nos genera el constructor, los métodos equals, hashCode y toString, asi como los métodos getter para los campos

    public record Persona(String nombre, int edad){}

    //Creamos una instancia de record Persona con los valores de "Carlos" y 28 para la edad

    public static void main(String[] args){
        Persona persona = new Persona("Carlos", 30);

        //Utilizamos los métodos getter implícitos del record para obtener el nombre, la edad y los imprimimos
        System.out.println("Nombre: " + persona.nombre());
        System.out.println("Edad: " + persona.edad());

    }
}
