package StringTemplates;

//Introducción de la edad

import java.util.Scanner;

public class Ejemplo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer nombre: ");

        String nombre = scanner.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = scanner.nextInt();

        String mensaje = STR."\{nombre} tiene \{edad} años";

        System.out.println(mensaje);
    }
}
