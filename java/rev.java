
import java.util.Scanner;

public class rev {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any word: ");
        String str = scanner.nextLine() ;
        String temp = " ";
        for(int i=str.length()-1;i>=0;i--){
            temp+=str.charAt(i);
        }
        System.out.println(temp);
    }
    
}
