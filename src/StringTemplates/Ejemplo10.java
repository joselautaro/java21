package StringTemplates;

import java.util.Scanner;

public class Ejemplo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        String mensaje = STR."Nombre completo: \{nombre} \{apellido}";
        System.out.println(mensaje);
    }
}
