package StringTemplates;

//Calcular el area de un rectángulo
import java.util.Scanner;

public class Ejemplo7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");

        double base = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double altura = scanner.nextDouble();

        double area = base * altura;

        String resultado = STR."El área del rectángulo es \{area}";

        System.out.println(resultado);

    }

}
