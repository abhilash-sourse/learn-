import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;

public class exception {
    public static void main(String[] args) {
       method1();
    }

    /*
     * stacktrace
     * 
     * exception name - java.lang.ArithmeticException
     * excepetion message -/ by zero
     * which line number
     * methods info
     */

    public static void method(String[] args) throws FileNotFoundException{
         System.out.println("Program execution start");
        int fnum = 9;
        int snum = 0;
        int result = 0;

        File  file = new File ("C:\\Git\\learn-\\java");
        FileInputStream fis = new FileInputStream(file);
        System.out.println(fis);
        try{

            result = fnum/snum;
        }
        catch(ArithmeticException ab){
            /*
             * ab name is a varable
             * you any name or words give this place
             */
            System.out.println(ab.toString());       //you got message (.getMessage())
            // using array [Arrays.toString(ab.getStackTrace())]
            //show details [b.printStackTrace();]
            throw ab;       // program stop below don't write any program line
        }
        finally{
            System.out.println("Finally block");
        }

        System.out.println("output is:"+result);
        System.out.println("program execution end");
    }

    public static void method1(){
        method();
    }
    
}
