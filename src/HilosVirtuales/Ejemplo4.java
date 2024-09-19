package HilosVirtuales;
//Hilos virtuales con computacion concurrente

import java.util.concurrent.*;

public class Ejemplo4 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        Callable<String> tarea = () -> {
            //Simulamos una tarea que demora 5 segundos
            Thread.sleep(5000);
            return "Resultado de la tarea";
        };

        //Ejecutamos la tarea.
        Future<String> resultado = executor.submit(tarea);
           try{
               //Obtenemos el resultado de la tarea (Bloquea la tarea hasta que finalice
               System.out.println("Resultado: " + resultado.get());
           }catch(InterruptedException | ExecutionException e){
               e.printStackTrace();
           }
       //Cerramos el ejecutor para que no acepte más tareas
        executor.shutdown();
           //Esperamos a que todas las tareas finalicen antes de cerrar el programa
            try{
               if( !executor.awaitTermination(5, TimeUnit.SECONDS) ){
                   System.out.println("Las tareas no terminaron en el tiempo esperado");
               }
            }catch(InterruptedException e){
                e.printStackTrace();
            }
    }
}
