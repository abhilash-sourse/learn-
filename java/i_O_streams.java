public class i_O_streams {
//     Types of Streams
// Byte Streams
// Work with raw binary data (like images, audio, and PDF files).
// Examples: FileInputStream, FileOutputStream.

// Character Streams
// Work with text (characters and strings). These streams automatically handle character encoding.
// Examples: FileReader, FileWriter, BufferedReader, BufferedWriter.



import java.io.FileInputStream;  // Import FileInputStream
import java.io.IOException;      // Import IOException

public class Main {
  public static void main(String[] args) {
    // try-with-resources: FileInputStream will be closed automatically
    try (FileInputStream input = new FileInputStream("filename.txt")) {

      int i;  // variable to store each byte that is read

      // Read one byte at a time until end of file (-1 means "no more data")
      while ((i = input.read()) != -1) {
        // Convert the byte to a character and print it to the console
        System.out.print((char) i);
      }

    } catch (IOException e) {
      // If an error happens (e.g. file not found), print an error message
      System.out.println("Error reading file.");
    }
  }
}


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
  public static void main(String[] args) {
    // Copy image.jpg into copy.jpg
    try (FileInputStream input = new FileInputStream("image.jpg");
         FileOutputStream output = new FileOutputStream("copy.jpg")) {

      int i;
      while ((i = input.read()) != -1) {
        output.write(i);  // write the raw byte to the new file
      }

      System.out.println("File copied successfully.");

    } catch (IOException e) {
      System.out.println("Error handling file.");
    }
  }
}


// Scanner - best for simple text and when you want to parse numbers or words easily.
// BufferedReader - best for large text files, because it is faster and reads line by line.
// FileInputStream - best for binary data (images, audio, PDFs) or when you need full control of raw bytes.

}
