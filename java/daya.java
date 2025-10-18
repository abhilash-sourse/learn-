import java.util.InputMismatchException;
import java.util.Scanner;


public class daya {

    private static Object scanner;
    public static void main(String[] args){
                            //exception
    
    try (Scanner scanner = new Scanner(System.in);){
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        System.out.println(number);
        
    } catch (InputMismatchException e) {
        System.out.println("that was't a number:");
    } catch (ArithmeticException e){
        System.out.println("You cant't divde by zero");
    } finally{
        ((Scanner) scanner).close();
    }

    }
}
