import java.util.*;

public class StreamAllInOne {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3, 6);

        long count = numbers.stream()

                .peek(n -> System.out.println("Original: " + n))   // peek

                .filter(n -> n > 3)                                 // filter

                .peek(n -> System.out.println("After filter: " + n))

                .map(n -> n * 2)                                    // map

                .peek(n -> System.out.println("After map: " + n))

                .sorted()                                           // sorted

                .peek(n -> System.out.println("After sorted: " + n))

                .count();                                           // count

        System.out.println("Total elements after filter: " + count);

        System.out.println("\nFinal Output using forEach:");
        numbers.stream()
               .filter(n -> n > 3)
               .map(n -> n * 2)
               .sorted()
               .forEach(System.out::println);                       // forEach
    }
}
