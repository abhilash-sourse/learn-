import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Textfilewriting {
    public static void main(String[] args) throws IOException {
        
        File file = new File("asimple.txt");
                    // you update don't write
        // if(file.exists())
        //     file.delete();
        // file.createNewFile();


        // String s = "hellso";
        // FileOutputStream fos = new FileOutputStream(file);
        // fos.write(72);   //the number is asch code
        // fos.write(69);
        // fos.write(76);
        // fos.write(76);
        // fos.write(79);



        // for(char ch : s.toCharArray()){
        //     fos.write((int)ch);
        // }
        // fos.flush();


        // fos.close();
        // fw.close();



                    // method 2
        // String s = "hello world";
        // FileWriter fw = new FileWriter(file);
        // fw.write(s);

        // fw.flush();
        // fw.close();

                // update any method


        String existStringText = new String();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";
        while((line = br.readLine()) != null){
            existStringText += line+ " \n";
        }
        String s = "svckhd cnsdcbhsdcb";

                    //method 3
    
        // String s = "hello worldsdasdd"; // update don't write
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write(existStringText + s); // only update
        bw.write(s);
        bw.flush();
        bw.close();

        
        
    }
    
}
