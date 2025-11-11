public class StarPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {       // loop for rows
            for (int j = 1; j <= i; j++) {   // loop for columns
                System.out.print("*");
            }
            System.out.println(); // move to next line
        }
    }
}