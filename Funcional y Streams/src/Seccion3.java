import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
public class Seccion3 {
    public static void main(String[] args) {
        
    //3.1
        Stream<String> nombres = Stream.of("Juan", "Maria", "Ana");

        Stream<String> nombresMayus = nombres.map(n -> n.toUpperCase()).peek(n -> System.out.println(n));

    //3.2
        System.out.println("\nLongitud: " + nombresMayus
                                                .mapToInt(s -> s.length())
                                                .sum()
);    

    //3.3
        //lista de listas
        List<List<String>> datos = Arrays.asList(Arrays.asList("Maia", "Ange", "Jenni", "Zoe"), 
                                                Arrays.asList("Carmen", "Laura", "Sofia"));

        System.out.println("\nMapList: " + datos.stream()
                                .flatMap(lista -> lista.stream())
                                .filter(n -> n.length() > 4)
                                .count()
    );


    //3.4
        String[] textos = {"cba", "aba", "bcad", "d"};

        Stream<String> ordenNatural = Arrays.stream(textos).sorted();

        System.out.println("\nOrden Natural :");
        ordenNatural.forEach(n -> System.out.println(n));

        Stream<String> ordenComparator = Arrays.stream(textos).sorted((a,b) -> a.length() - b.length());

        System.out.println("\nOrdenados por longitud: " );
        ordenComparator.forEach(n-> System.out.println(n));
    }
}
