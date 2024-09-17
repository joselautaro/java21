package PatternsSwitch;

/*
Próposito: manejar enumeración que representa dias de la semana

Uso: Permite realizar acciones basadas en el valor de la enumeración dia, agrupando dias similares para simplificar el manejo de casos
* */

public class Ejemplo5 {

    //Definimos una enumeración llamada Dia con los dias de la semana laboral
    public enum Dia {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
    }

    public static void main(String[] args) {

        //Definimos una variable de tipo Dia con el valor de JUEVES
        Dia dia = Dia.JUEVES;

        //Iniciamos un swithc para evaluar el valor de la variable 'dia

        switch(dia){
            case LUNES, MARTES -> System.out.println("Inicio de la semana laboral");
            case MIERCOLES -> System.out.println("Mitad de semana");
            case JUEVES -> System.out.println("Dia elegido");
            case VIERNES -> System.out.println("Fin de la semana");
            default -> System.out.println("No tenés franco hoy");
        }

    }
}
