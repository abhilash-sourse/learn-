import java.util.*;
import java.util.stream.*;

public class StreamExtraOperations {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 4, 5, 5, 6};

        Object[] result = Arrays.stream(numbers)

                .distinct()                    // remove duplicates

                .skip(1)                       // skip first element

                .limit(4)                      // take only 4 elements

                .mapToObj(n -> "Value: " + n)  // int → Object (String)

                .toArray();                    // convert to array

        // Print final array
        for (Object o : result) {
            System.out.println(o);
        }
    }
}
