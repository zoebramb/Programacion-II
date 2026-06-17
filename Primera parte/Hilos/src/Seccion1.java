public class Seccion1 {
    public static void main(String[] args) throws Exception {

    //1.1
        TareaHilo hilo1 = new TareaHilo();
        TareaHilo hilo2 = new TareaHilo();

        hilo1.start();
        hilo2.start();

    //1.2
        //Hay que instanciar la tarea por un lado
        TareaRunnable tarea = new TareaRunnable();

        Thread hilo3 = new Thread(tarea);
        Thread hilo4 = new Thread(tarea);

        hilo3.start();
        hilo4.start();
    }
}
