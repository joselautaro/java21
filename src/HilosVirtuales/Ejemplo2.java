package HilosVirtuales;
//Ejecución de multiples hilos virtuales
public class Ejemplo2 {
    public static void main(String[] args) {
        for( int i = 0; i < 5; i++ ){
            //Crear y ejecutar cada hilo virtual
            Thread.ofVirtual().start(() -> {
                //cada hilo virtual para a imprimir su propia identificación
                System.out.println("Hilo virtual ID: " + Thread.currentThread().getId());
            });
        }
        //Pausa para permitir que los hilos virtuales terminen antes de finalizar el programa
        try{
            Thread.sleep(1000); //1000 milisegundos == 1 segundo
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
