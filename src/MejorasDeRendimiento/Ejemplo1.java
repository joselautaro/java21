package MejorasDeRendimiento;
//Mejoras en el uso de string
//Java 21 optimiza internamente la gestion de cadenas de texto mediante tecnicas de duplicación de cadenas en la JVM. Es decir, se crean multiples cadenas con el mismo contenido, por lo tanto puede utilizar una unica instancia en lugar de crear varias copias

public class Ejemplo1 {

    public static void main(String[] args) {

        //Aunque estamos creando varias cadenas iguales, la JVM reutiliza la misma instancia en memoria
        String cadena1 = "optimización";

        String cadena2 = "optimización";

        //Comparación de referencias, gracias a la optimización de la JVM
        //ambas cadenas van a apuntar al mismo objeto

        System.out.println(cadena1 == cadena2);
    }

}
