import java.util.Scanner;
import java.util.Random;
import jdk.jshell.spi.ExecutionControl;

public class main {
    public static void main(String[] args){ //throws InterruptedException{
                 //while loop

        Scanner scanner = new Scanner(System.in);
        // String response = "";
        // while(!response.equals("Q")){
        //     System.out.println("You are playing a game:");
        //     System.out.print("Press Q to quit :");
        //     response = scanner.next().toUpperCase();
        // }

                    //do while loop

        // int age = 0;

        // do{
        //     System.out.println("Your age can't be negative");
        //     System.out.println("Enter your age:");
        //     age = scanner.nextInt();
        // }while(age < 0);

        // System.out.println("You age " + age +  " Years old");

                 //number guessing game

        // Random random = new Random();
        
        // int guess;
        // int attempts = 0;
        // int max = 100;
        // int min = 10;
        // int randomNummer = random.nextInt(max-min + 1) + min;

        // System.out.println("Number guessing Game ");
        // System.out.printf("Guess a number between %d to %d\n",min,max);

        // do { 
        //     System.out.print("Enter a guess Number: ");
        //     guess = scanner.nextInt();
        //     attempts++;

        //     if(guess < randomNummer){
        //         System.out.println("TOO LOW ! TRY AGAIN");
        //     }else if(guess > randomNummer){
        //         System.out.println("TOO HIGH TRY AGAIN");
        //     }else{
        //         System.out.println("CORRECT! you guessed the number win");
        //         System.out.println("Total attempt " +  attempts);
        //     }
 
        // } while (guess != randomNummer);


                        //for loop

        // for(int i = 0; i < 10; i ++){
        //     System.out.println("Pizza");
        // }

        // System.out.print("Enter how many times you want to loop:");
        // int max = scanner.nextInt();

        // for(int i = max; i > 0; i--){
        //     System.out.println(i);
        //     Thread.sleep(1000);

        // }System.out.println("boom boom");


                    //nested loop

            // for(int i = 1;i <= 3; i++){
            //     for (int j = 1; j <= 9; j++){
            //         System.out.print("j"+"");
            //     }
            //     System.out.println();
            // }


        // int rows;
        // int columns;
        // char symbol;

        // System.out.println("Enter the # of rows:");
        // rows = scanner.nextInt();

        // System.out.println("Enter the # of columns:");
        // columns = scanner.nextInt();

        // System.out.println("Enter the symbol to use:");
        // symbol = scanner.next().charAt(0);

        // for(int i = 0; i < rows; i ++){
        //     for(int j = 0;j < columns; j++){
        //         System.out.print(symbol);
        //     }
        //     System.out.println();
        // }
        

        scanner.close();

    }
}
