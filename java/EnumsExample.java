import java.util.Scanner;

public class EnumsExample {
    enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        String response = scanner.nextLine().trim().toUpperCase();

        try {
            Days day = Days.valueOf(response);

            switch (day) {
                case SATURDAY:
                case SUNDAY:
                    System.out.println("It is a weekend");
                    break;
                default:
                    System.out.println("It is a weekday");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Please enter a valid day (e.g., Monday)");
        }

        scanner.close();
    }
}
