package StringTemplates;

//Conversión de millas a kilometros

import java.util.Scanner;

public class Ejemplo12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese a distancia en millas: ");
        double millas = scanner.nextDouble();

        double kilometros = millas * 1.60934;
        String mensaje = STR."\{millas} millas son \{kilometros} kilometros";

        System.out.println(mensaje);
    }


}
