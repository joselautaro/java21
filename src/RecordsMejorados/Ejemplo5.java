package RecordsMejorados;

public class Ejemplo5 {

    public record Persona(String nombre, int edad) {}

    public static void main(String[] args) {
        Persona persona = null;

        if(persona instanceof Persona(String nombre, int edad)){
            System.out.println("El persona es: "+nombre);
            System.out.println("El edad es: "+edad);
        }else{
            System.out.println("El objeto persona es null");
        }
    }
}
