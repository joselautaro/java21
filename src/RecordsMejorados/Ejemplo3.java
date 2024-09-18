package RecordsMejorados;

public class Ejemplo3 {

    public record Persona(String nombre, int edad){}

    public static void main(String[] args) {

        Persona persona = new Persona("José", 40);

        if (persona instanceof Persona(String nombre, int edad) && edad > 30) {
            System.out.println(STR."\{nombre},  es mayor de 30 años.");
        }

    }


}
