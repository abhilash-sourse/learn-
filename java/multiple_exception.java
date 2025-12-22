public class multiple_exception {

    public class Main {
  public static void main(String[] args) {
    try {
      int[] numbers = {1, 2, 3};
      System.out.println(numbers[10]);  // ArrayIndexOutOfBoundsException
      int result = 10 / 0;              // ArithmeticException
    } 
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index does not exist.");
    } 
    catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero.");
    } 
    catch (Exception e) {
      System.out.println("Something else went wrong.");
    }
  }
}





try {
  int result = 10 / 0;
  int[] numbers = {1, 2, 3};
  System.out.println(numbers[10]);
} 
catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
  System.out.println("Math error or array error occurred.");
}



// try-with-resources


import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      FileOutputStream output = new FileOutputStream("filename.txt");
      output.write("Hello".getBytes());
      output.close();  // must close manually
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("Error writing file.");
    }
  }
}






import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    // resource is opened inside try()
    try (FileOutputStream output = new FileOutputStream("filename.txt")) {
      output.write("Hello".getBytes());
      // no need to call close() here
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("Error writing file.");
    }
  }
}
    
}
