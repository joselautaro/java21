package StringTemplates;

public class Ejemplo1 {
    public static void main(String[] args) {
        String nombre = "Profe Lauta";

        int edad = 31;

        String template1 = STR."Nombre: \{ nombre }, Edad: \{ edad }";

        System.out.println(template1);
    }
}
