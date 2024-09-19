package NullSafePreview;



public class Ejemplo1 {

    public static void main(String[] args) {
        //Creamos un objeto string que es null
        String texto = "Venite";

        //Verificamos si el texto es nulo antes de acceder al método length
        Integer longitud = (texto != null) ? texto.length() : null;

        //Se imprime el resultado: como texto es null
        System.out.println("Longitug: " + longitud);
    }
}
