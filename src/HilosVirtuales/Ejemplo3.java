package HilosVirtuales;

//Uso de executor para manejar hilos virtuales

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ejemplo3 {
    public static void main(String[] args) {
        //Crear un executorService con un Executor de hilos virtuales
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        //Ejecutamos 10 tareas usando el ejecutor
        for( int i = 0; i < 10; i++){
            int taskNumber = i;
            executor.submit(() -> {
                System.out.println("Ejecutando tarea: " + taskNumber);
            });
        }
        //Cerramos el Executor para liberar todos los recursos
        executor.shutdown();

        //Esperamos a que todas las tareas terminen
        try{
            if(!executor.awaitTermination(5, TimeUnit.SECONDS)){
                System.out.println("Algunas tareas no se completaron en el tiempo esperado");
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
