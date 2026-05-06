public class Seccion3 {
    public static void main(String[] args) throws InterruptedException {
         
        ContadorSync contador = new ContadorSync();

        Runnable tarea = () -> {
            for(int i = 0; i<10000 ; i++)
            {
                contador.incrementarSync();
            }
        };

        Thread h1 = new Thread(tarea);
        Thread h2 = new Thread(tarea);

        h1.start();
        h2.start();

        h1.join();
        h2.join();

        System.out.println("Usando método sincronizado, el resultado: " + contador.i);


        Runnable tareaBloque = () -> {
            for(int i = 0; i<10000 ; i++)
            {
                contador.incrementarBloque();
            }
        };

        Thread h3 = new Thread(tareaBloque);
        Thread h4 = new Thread(tareaBloque);

        h3.start();
        h4.start();

        h3.join();
        h4.join();

        System.out.println("Usando bloque sincronizado, resultado: " + contador.valor);
    }
}
