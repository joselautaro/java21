package PatternsSwitch;

public class Ejemplo2 {
    public static void main(String[] args) {
        String dia = "Martes";
        switch (dia) {
            case "Lunes" -> System.out.println("Inicio de semana");

            case "Martes" -> System.out.println("Segundo dia de la semana");

            case "Miercoles" -> System.out.println("Mitad de semana");

            default -> System.out.println("Dia no encontrado");
        }
    }
}
