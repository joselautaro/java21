package NullSafePreview;

public class Ejemplo2 {

    public static void main(String[] args) {
        //Creamos un objeto string que es null
        String texto = "Valiente";

        //Encadenamiento seguro
        String mayusculas = (texto != null) ? texto.toUpperCase().trim() : null;

        //Se imprime el resultado: como texto es null
        System.out.println("Longitug: " + mayusculas);
    }
}
