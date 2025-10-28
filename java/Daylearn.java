import java.util.Scanner;

public class Daylearn {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int a,b,c;
        double total,total_gst;
        System.out.println("**************************");
        System.out.println("WELCOME TO RLJIT HOTAL....");
        System.out.println("**************************");
        System.out.print("How many  plate of vada:");
        a = scan.nextInt();
        System.out.print("How many  plate of dosa:");
        b = scan.nextInt();
        System.out.print("How many  plate of idli:");
        c = scan.nextInt();
        int x = a*60;
        System.out.println("\nThe cost of vada:" + x);
        int y = b*50;
        System.out.println("The cost of dosa:" + y);
        int z = c*40;
        System.out.println("The cost of idli:" + z);
        total = x + y + z;
        System.out.println("\nThe total amount :" + total);
        double gst = 18.0;
        total_gst = (total * gst)/100;
        double amount = total + total_gst;
        System.out.println("Total amount (with GST):"+amount);
        System.out.println("\n*******************************");
        System.out.println(".......THANKYOU FOR VISIT.......");
        System.out.println("*******************************");

        scan.close();


    }
}
