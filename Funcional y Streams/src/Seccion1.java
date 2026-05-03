import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.ToIntFunction;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Arrays;

public class Seccion1 {
    public static void main(String[] args) throws Exception {

        //1.1
        //predicate usando metodo test
        
        Predicate<Integer> esPar = n -> n % 2 == 0; //le doy al predicate una funcion que se ejecuta y devuelve un booleano

        if(esPar.test(5))
        {
            System.out.println("Es par");
        }
        else
        {
            System.out.println("No es par");
        }

        //Function
        Function<String, Integer> Longitud = s -> s.length();

        System.out.println("La longitud de la palabra 'Caramelo' es: " + Longitud.apply("Caramelo"));

        //Consumer
        Consumer<Integer> imprimir = n -> System.out.println("El numero es: " + n);
        imprimir.accept(10);

        //Supplier
        Supplier<Double> numeroAleatorio = () -> Math.random();
        System.out.println("Numero aleatorio: " + numeroAleatorio.get());

    //1.2

        List<String> textos = new ArrayList<>();
        
        textos.add("Hola");
        textos.add("Dijo");
        textos.add("Zoe");
        textos.add("Colo");


        textos.sort((a,b)-> a.length() - b.length());

        System.out.println(textos);
    
    //1.3
        
        ToIntFunction<String> longitud = s -> s.length();

        int largo = longitud.applyAsInt("Blablablabla");

        System.out.println("La palabra Blablablabla tiene " + largo + " letras");

        IntPredicate esParINT = n -> n % 2 == 0;

        System.out.println("¿Es el número 10 par? " + esParINT.test(10));
    }
}
