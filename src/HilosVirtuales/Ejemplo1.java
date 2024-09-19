package HilosVirtuales;

public class Ejemplo1 {

    public static void main(String[] args) {
        //Creamos un hilo virtual usando un método factory
        Thread virtualThread = Thread.ofVirtual().start(() ->{
            //Esta es la tarea que el hilo ejecutará, solo imprimimos un mensaje
            System.out.println("Hilo virtual ejecutándose");
        });
    //Esperamos a que el hilo termine su ejecución
        try{
            virtualThread.join();
        }catch( InterruptedException e ){
            e.printStackTrace();
        }
    }


}
