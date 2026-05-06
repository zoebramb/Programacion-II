public class Seccion2 {
    public static void main(String[] args) throws InterruptedException { //se agrega esa excepcion por los join
    
        Contador c1 = new Contador();

        Runnable tarea = () -> {
            for(int i = 0; i<10000 ; i++)
            {
                c1.incrementar();
            }
        };

        Thread h1 = new Thread(tarea);
        Thread h2 = new Thread(tarea);

        h1.start();
        h2.start();

        //agrego el join para poder ver el resultado final, si no lo agrego me muestra que i vale 0
        h1.join();
        h2.join();

        System.out.println("El resultado esperado es 20000, el resultado que tenemos es: " + c1.i);
    }
}
