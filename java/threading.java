
import java.util.Scanner;

public class threading {
    public static void main(String[] args) {

 Scanner scanner = new Scanner(System.in);

        // System.out.println("You have 5 seconds to enter your name...");

        // 
        // Thread inputThread = new Thread(() -> {
        //     Scanner scanner = new Scanner(System.in);
        //     System.out.print("Enter your name: ");
        //     String name = scanner.nextLine();
        //     System.out.println("Hello, " + name + "!");
        //     scanner.close();
        // });

        // inputThread.start();

        // try {
        //     // Wait for 5 seconds
        //     inputThread.join(5000);
        // } catch (InterruptedException e) {
        //     System.out.println("Main thread interrupted");
        // }

        //  
        // if (inputThread.isAlive()) {
        //     System.out.println("\n⏰ Time's up! You didn’t enter your name in time.");
        //     inputThread.interrupt(); 
        // }





     
        MyRunnable myRunnable = new MyRunnable();
        Thread timerThread = new Thread();
        timerThread.start();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        timerThread.interrupt();

        System.out.println("Hello, " + name + "!");
        scanner.close();
  


        scanner.close();
    }
    
}
