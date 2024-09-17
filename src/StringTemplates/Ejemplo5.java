package StringTemplates;

public class Ejemplo5 {
    public static void main(String[] args) {
        int cantidad = 1;

        String mensaje = STR."Has comprado \{ cantidad } \{ cantidad > 1 ? "articulos" : "articulo" }";

        System.out.println(mensaje);
    }
}
