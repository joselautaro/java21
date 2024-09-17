package StringTemplates;

public class Ejemplo4 {
    public static void main(String[] args) {
        int precio = 100;

        double descuento = 0.1;

        String mensaje = STR."El precio con un 10% de descuento es: \{ precio * (1 - descuento) }";

        System.out.println(mensaje);
    }
}
