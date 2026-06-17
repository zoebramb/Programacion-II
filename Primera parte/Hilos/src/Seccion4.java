public class Seccion4 {
    public static void main(String[] args) throws InterruptedException{
        //4.1
            Runnable identidad = () -> {
                System.out.println("Identidad del hilo: con prioridad: " + Thread.currentThread().getPriority() +" " + Thread.currentThread());
            };

            Thread hilo1 = new Thread(identidad);
            Thread hilo2 = new Thread(identidad);

            hilo1.setPriority(10);
            hilo2.setPriority(1);

            hilo2.start();
            hilo1.start();

            /* Al momento de correr el programa el hilo con mayor prioridad se 
            resuelve primero */

        //4.2
            Runnable muchoTiempo = () -> {
                try{
                    Thread.sleep(4000);
                    System.out.println("\nTardé 4000 milisegundos en terminar");
                } catch (InterruptedException e){
                    System.out.println("Hilo interrumpido. ");
                }
            };

            Thread hiloTiempo = new Thread(muchoTiempo);

            hiloTiempo.start();

            //experimento adicional
            Thread.sleep(1500);
            hiloTiempo.interrupt();

    }
}
