import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AlarmClock implements Runnable {

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;
    private final DateTimeFormatter formatter;

    public AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner, DateTimeFormatter formatter) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
        this.formatter = formatter;
    }

    @Override
    public void run() {
        try {
            System.out.println("\n--- Countdown Started ---");

            while (LocalTime.now().isBefore(alarmTime)) {
                LocalTime now = LocalTime.now();
                long secondsLeft = ChronoUnit.SECONDS.between(now, alarmTime);

                // show time in 12-hour format
                System.out.printf("\rCurrent Time: %s | Alarm in %02d seconds",
                        now.format(formatter), secondsLeft);

                Thread.sleep(1000);
            }

            System.out.println("\n\n*ALARM TIME!*");
            Toolkit.getDefaultToolkit().beep();
            playSound(filePath);

        } catch (InterruptedException e) {
            System.out.println("Alarm thread interrupted");
        }
    }

    private void playSound(String filePath) {
        File audioFile = new File(filePath);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();

            System.out.println("Press ENTER to stop the alarm...");
            scanner.nextLine();
            clip.stop();
            clip.close();

            System.out.println("Alarm stopped. Have a good day!");

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file format not supported.");
        } catch (LineUnavailableException e) {
            System.out.println("Audio line unavailable.");
        } catch (IOException e) {
            System.out.println("Error reading audio file.");
        }
    }
}
