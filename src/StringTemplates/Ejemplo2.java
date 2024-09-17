package StringTemplates;

public class Ejemplo2 {
    public static void main(String[] args) {
        int x = 5;

        int y = 6;

        String result1 = STR."Suma: \{ x + y }";

        System.out.println(result1);
    }
}
