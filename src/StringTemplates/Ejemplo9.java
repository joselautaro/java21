package StringTemplates;

//Comparar dos números

import java.util.Scanner;

public class Ejemplo9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segungo número: ");
        int numero2 = scanner.nextInt();

        String mensaje = STR."El numero mayor entre \{numero1} y \{numero2} es \{(numero1 > numero2) ? numero1 : numero2}.";

        System.out.println(mensaje);

    }
}
