package StringTemplates;

import java.util.Scanner;

public class Ejemplo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese precio original: ");
        double precio = scanner.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento: ");
        double descuento = scanner.nextDouble();

        double precioFinal = precio * (1 - descuento / 100);
        String mensaje = STR."El precio final después de un descuento del \{descuento}% es \{precioFinal}.";

        System.out.println(mensaje);
    }

}
