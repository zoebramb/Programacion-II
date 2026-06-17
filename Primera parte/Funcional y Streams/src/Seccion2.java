import java.util.stream.Stream;

public class Seccion2 {
    public static void main(String[] args) {
        
    //2.1
        Stream<Integer> stream = Stream.of(2,5,3,3,6,2,4);

        System.out.println("Elementos finales: " + stream.distinct().skip(1).count());

    //2.2
        Stream<Integer> stream2 = Stream.of(2,4,7,2,8,9,0);
        System.out.println("Elemento finales: " + stream2
                    .filter(s -> s > 3)
                    .peek(n -> System.out.println("peek " + n))
                    .count()
        );   
    }
    
}
