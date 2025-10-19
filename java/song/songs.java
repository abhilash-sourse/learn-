package song;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class songs {
    public static void main(String[] args) {
        String filepath  = "src/song/A caring friends.wav";
        File file = new File(filepath);

        try (Scanner scanner = new Scanner(System.in)) {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while (!response.equals("Q")) {
                System.out.println("\nP = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setFramePosition(0);
                    case "Q" -> {
                        clip.close();
                        System.out.println("Playback ended.");
                    }
                    default -> System.out.println("Invalid choice.");
                }
            }

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file not supported.");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource.");
        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }
    }
}
