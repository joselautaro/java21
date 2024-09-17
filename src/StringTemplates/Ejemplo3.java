package StringTemplates;

public class Ejemplo3 {
    public static void main(String[] args) {
        String saludo = "mundo";

        String mensaje = STR."Hola, \{ saludo.toUpperCase() }";

        System.out.println(mensaje);
    }
}
