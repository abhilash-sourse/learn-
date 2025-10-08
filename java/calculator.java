import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+,-,*,/,^):");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' : result = num1 + num2;
            break;
            case '-' : result = num1 - num2;
            break;
            case '*' : result = num1 * num2;
            break;
            case '/' :{
                if(num2 == 0){
                    System.out.println("Cannot divide by Zero!");
                }else{
                    result = num1 / num2;
                    break;
                }
            }    
            case '^' : result = Math.pow(num2, num2);
            break;
            default:
                System.err.println("Invalid operator!");
                validOperation = false;
            
        }
        if(validOperation){
            System.err.println("Result: " + result);
        }
        scanner.close();
    }
    
}
