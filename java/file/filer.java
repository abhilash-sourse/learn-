import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
//r
import java.io.BufferedReader;

public class filer {
    public static void main(String[] args) {

                        //w

        String filePath = "C:\\Git\\learn-\\java\\file\\abhi.txt";

        // String TextCotenat = """
        //          axkhsciascbsaj
        //          scacbocbnsac
        //          cnjciaspkcn
        //          scnsjlbcipasc
        //         """;
        // try (FileWriter writer = new FileWriter(filePath)) {
        //     writer.write("I like pizza!");
        //     writer.write(TextCotenat);
        //     System.out.println("File written successfully!");
        // } catch (FileNotFoundException e) {
        //     System.out.println("Could not locate file location");
        // } catch (IOException e) {
        //     System.out.println("Could not write to the file");
        // }

                            //r

        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file location");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }



    }
}
