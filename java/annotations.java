public class annotations {
//     @Override	Indicates that a method overrides a method in a superclass
// @Deprecated	Marks a method or class as outdated or discouraged from use
// @SuppressWarnings	Tells the compiler to ignore certain warnings

class Animal {
  void makeSound() {
    System.out.println("Animal sound");
  }
}

class Dog extends Animal {
  @Override
  void makeSound() {
    System.out.println("Woof!");
  }
}



public class Main {
  @Deprecated
  static void oldMethod() {
    System.out.println("This method is outdated.");
  }

  public static void main(String[] args) {
    oldMethod(); // This will show a warning in most IDEs
  }
}



import java.util.ArrayList;

public class Main {
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    ArrayList cars = new ArrayList();
    cars.add("Volvo");
    System.out.println(cars);
  }
}
    
}
