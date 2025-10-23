import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class alarm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Use 12-hour format with AM/PM
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a", Locale.ENGLISH);
        LocalTime alarmTime = null;
        String filePath = "A caring friends.wav"; // sound file

        while (alarmTime == null) {
            try {
                System.out.print("Enter an alarm time (hh:mm:ss AM/PM): ");
                String inputTime = scanner.nextLine().trim().toUpperCase(); // allow am/pm or AM/PM

                LocalTime enteredTime = LocalTime.parse(inputTime, formatter);
                LocalTime now = LocalTime.now().truncatedTo(ChronoUnit.SECONDS);

                if (enteredTime.isBefore(now)) {
                    System.out.println("That time has already passed! Please enter a future time.\n");
                    continue;
                }

                alarmTime = enteredTime;
                System.out.println("Alarm set for " + alarmTime.format(formatter));

            } catch (DateTimeException e) {
                System.out.println("Invalid format. Please use hh:mm:ss AM/PM\n");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner, formatter);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
    }
}
