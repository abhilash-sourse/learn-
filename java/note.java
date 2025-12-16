import java.util.regex.Pattern;

public class note {
    public static void main(String[] args) {
        // Widening
// byte<short<int<long<float<double
int i = 10;
long l = i;               // 10

// Narrowing 
double d = 10.02;
long l = (long)d;         // 10

String.valueOf(10);       // "10"
Integer.parseInt("10");   // 10
Double.parseDouble("10"); // 10.0










int[] numbers = {1,2,3,4,5};

for (int number: numbers) {
  System.out.print(number);
}
// Outputs: 12345




String text = "I am learning Java";
// Removing All Whitespace
text.replaceAll("\\s+", "");

// Splitting a String
text.split("\\|");
text.split(Pattern.quote("|"));





















    }
    
}
