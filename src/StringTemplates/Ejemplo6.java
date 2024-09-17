package StringTemplates;

public class Ejemplo6 {
    public static void main(String[] args) {
        String titulo = "Informe mensual";

        String autor = "Carlos";

        int paginas = 50;

        String informe = STR."""
                Titulo: \{titulo}
                Autor: \{autor}
                Páginas: \{paginas}
                """;
        System.out.println(informe);
    }
}
