package RecordsMejorados;


public class Ejemplo4 {

    public record Persona(String nombre, int edad) {}

    public static void main(String[] args) {

        Persona persona = new Persona("Lorenzo", 35);

        imprimirDatos(persona);

    }
    public static void imprimirDatos(Persona persona) {

        if(persona instanceof Persona(String nombre, int edad)) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
        }

    }
}
