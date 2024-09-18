package RecordsMejorados;

/*
* Vamos a utilizar coincidencia de patrones para verificar que un objeto persona es una instancia del Persona. Si es así, extrae sus campos nombre y edad, y los imprime. La coincidencia de los patrones permite acceder a los valores internos de un record, sin tener que llamar directamente a los métodos nombre y edad
* */

public class Ejemplo2 {

    public record Persona(String nombre, int edad){}
    public static void main(String[] args) {

        Persona persona = new Persona("Mary", 28);

        if(persona instanceof Persona(String nombre, int edad)){
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
        }

    }

    /*De que manera generamos un record y lo instanciamos desde distintas clases*/

}
