import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Handle_files{
    public static void main(String[] args) throws IOException {
        File file  = new File ("abh.xss");
        if(!file.exists())
            file.createNewFile();

        Properties prop = new Properties();
        // prop.setProperty("url","abhi");
        // prop.setProperty("urssl","abhsssi");
        // prop.setProperty("gfhgfurl","abhiff");

        FileOutputStream fos = new FileOutputStream(file);
        prop.store(fos,"new pop");
        //  prop.store(fos,"abhinbcbscbs"); 

        Set<String> keys = prop.stringPropertyNames();
        System.out.println(prop.getProperty("manbsdhcbk,","hscvisdc"));
       }

    
}
