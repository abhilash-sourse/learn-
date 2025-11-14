import java.io.File;
import java.io.IOException;
import java.sql.Array;
import java.util.Arrays;

public class filehandling {
      /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

                // create file

        // File f = new File("C:\\Git\\learn-\\java\\file\\abhilash.txt"); //  useing \\ or /
        // System.out.println(f.createNewFile());

                //delete file

        // System.out.println(f.delete());

                //looking for file

        // System.out.println(f.exists());

                // joint a file or recreate

        // if(f.exists())
        //     f.delete();
        // System.out.println(f.createNewFile());

                //findind the hidden file

        // System.err.println(f.isHidden());
        
                //file can read or write

        // System.out.println(f.canWrite());
        // System.out.println(f.canRead());

                // file is convert to read only file to normal file

        // System.out.println(f.canWrite());
        // f.setWritable(true);
        // System.out.println(f.canWrite());

                    //folder

        File fo = new File("C:\\Git\\learn-\\java\\file");

                //create dir
        // System.out.println(fo.mkdir());

                //delete dir
        // if(fo.exists())
        //     fo.delete();
        // System.out.println(fo.exists());


                //list
        // System.out.println(Arrays.toString(fo.list()));
        // System.out.println(Arrays.toString(fo.listFiles()));
        // System.out.println(fo.getName());
        // System.out.println(fo.getAbsolutePath());
        System.out.println(fo.getParent());
        File f2 = new File(fo.getParent() + "/resume.docx");
        f2.createNewFile();




    }
    
}
