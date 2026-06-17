import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.Map;

public class Seccion4 {
    public static void main(String[] args) {
        
    //4.1
        boolean anyMatch = Stream.of(2,5,7,3,6,2,3).anyMatch(n-> n > 5);

        System.out.println("Hay algun numero mayor a 5? " + anyMatch);

        boolean allMatch = Stream.of(2,5,7,3,6,2,3).allMatch(n -> n > 0);

        System.out.println("Son todos positivos? " + allMatch);

        boolean noneMatch = Stream.of(2,5,7,3,6,2,3).noneMatch(n -> n > 10);

        System.out.println("Son todos menores a 10? " + noneMatch);

    //4.2
        Stream<Integer> numeros = Stream.of(5,7,3,6,2,3);
        Optional<Integer> op = numeros
                                    .filter(n -> n % 2 == 0)
                                    .findFirst();

        if (op.isPresent()) {
            System.out.println("\nPrimer numero par: " + op.get());
        } else {
            System.out.println("No se encontró un número par.");
        }

    //4.3
        Stream<Integer> numReduce = Stream.of(5,7,3,6,2,3);

        Optional<Integer> reduce = numReduce.reduce((a,b) -> a+b);
        System.out.println("\nSuma de todos los elementos: " + reduce.get());

//4.4
/* Dada una serie de números con duplicados, utiliza
.distinct().collect(Collectors.toList()) para generar y devolver una List limpia. Luego, utilizando una clase Persona con un método getDni() y un método getNombre(), genera un mapa a partir de un flujo de personas usando
.collect(Collectors.toMap(p -> p.getDni(), p -> p.getNombre())). */
    Stream<Integer> duplicados = Stream.of(4,2,4,6,1,2,9,1);

    List<Integer> sinDuplicados = duplicados
                                        .distinct()
                                        .collect(Collectors.toList());

    sinDuplicados.forEach(n-> System.out.println(n));

    Persona p1 = new Persona(111, "Zoe");
    Persona p2 = new Persona(112, "juan");
    Persona p3 = new Persona(121, "Lucia");
    Persona p4 = new Persona(113, "Clara");

    Stream<Persona> personas = Stream.of(p1,p2,p3,p4);

    Map<Integer, String> mapaPersonas = personas.collect(Collectors.toMap(p -> p.getDni(), p -> p.getNombre()));
    
    System.out.println(mapaPersonas);
    }
}