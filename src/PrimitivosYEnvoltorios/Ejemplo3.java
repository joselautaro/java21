package PrimitivosYEnvoltorios;

//Ejemplo 3: Uso de Map con double y Double

import java.util.HashMap;
import java.util.Map;

public class Ejemplo3 {
    public static void main(String[] args) {
        Map<String, Double> mapaDePrecios = new HashMap<>();

        //Agregar elementos al mapa
        mapaDePrecios.put("Manzana", 0.99);
        mapaDePrecios.put("Banana", 0.59);


        //Iterar sobre el mapa y mostrar precios

        for(Map.Entry<String, Double> entrada : mapaDePrecios.entrySet()){
            String producto = entrada.getKey();
            Double precio = entrada.getValue();

            //Moitrar el producto y su precio
            System.out.println(STR."El precio de \{producto} es $\{precio}");
        }
    }
}
