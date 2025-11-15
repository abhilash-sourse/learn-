import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Testfile {
    public static void main(String[] args) throws IOException {
        File fe = new File("./sample.txt");

        if(!fe.exists())
            fe.createNewFile();

                        //1 method
        // FileInputStream fis = new FileInputStream(fe);

        // System.out.println(fis.read());   //show only one char number

        // System.out.println((char)fis.read()); // show only one char

        // int asciiCode;
        // while((asciiCode = fis.read()) != -1){
        //     System.out.print((char)asciiCode);
        // }
        // fis.close();



                        //2 method
        // Scanner scanner = new Scanner(fe);
        // String text = new String();//2 1 is also same
        // while(scanner.hasNextLine()){
        //     text += scanner.nextLine() + "\n"; // 2
        //     // System.out.println(scanner.nextLine());
        // }
        // System.out.println(text);// 2
        // scanner.close();

                    //3 method

        // FileReader fr = new FileReader(fe);

        // int asciiCode;
        // String text = new String();
        // while((asciiCode = fr.read()) != -1){
        //     text += String.valueOf((char)asciiCode);
            
        // }
        // System.out.println(text);
        
        // fr.close();



                //4 method
        FileReader fr = new FileReader(fe);

        BufferedReader br = new BufferedReader(fr);

                    //4.1 method
        // int asciiCode;
        // String text = new String();
        // while((asciiCode = br.read()) != -1){
        //     text += String.valueOf((char)asciiCode);
            
        // }
        // System.out.println(text);
        
        // fr.close();
        // br.close();


                    //4.2 method in line by line
        
        String text = new String();
        String line = new String();
        while((line = br.readLine()) != null){
            text += line + "\n";
        }
        System.out.println(text);
        fr.close();
        








    }
    
}
