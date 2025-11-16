import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exceptionhandling2 {

    public static void main(String[] args) throws IOException {

        File fe = new File("./sample.txt");

        if(!fe.exists())
            fe.createNewFile();
        
        FileReader fr = new FileReader(fe);
        BufferedReader br = new BufferedReader(fr);
        String text = new String();
        String line = new String();
        while((line = br.readLine()) != null){
            text += line + "\n";
        }
        System.out.println(text);
        fr.close();
    }
}
