// class Box<T> {
//     T value;

//     void set(T value) {
//         this.value = value;
//     }

//     T get() {
//         return value;
//     }
// }

// public class GenericClassDemo {
//     public static void main(String[] args) {

//         Box<Integer> b1 = new Box<>();
//         b1.set(100);
//         System.out.println(b1.get());

//         Box<String> b2 = new Box<>();
//         b2.set("Java");
//         System.out.println(b2.get());
//     }
// }


// 2 method

// class GenericMethod {
//     static <T> void display(T value) {
//         System.out.println(value);
//     }

//     public static void main(String[] args) {
//         display(10);
//         display("Hello");
//         display(25.5);
//     }
// }


// 3 method
// class Test<T extends Number> {
//     T num;
//     Test(T num) {
//         this.num = num;
//     }
// }

// 4 method 
// import java.util.*;

// public class GenericCollection {
//     public static void main(String[] args) {

//         ArrayList<String> list = new ArrayList<>();
//         list.add("Java");
//         list.add("Python");

//         for (String s : list) {
//             System.out.println(s);
//         }
//     }
// }

// 5 method

// import java.util.*;

// public class GenericCollection {
//     public static void main(String[] args) {

//         ArrayList<String> list = new ArrayList<>();
//         list.add("Java");
//         list.add("Python");

//         for (String s : list) {
//             System.out.println(s);
//         }
//     }
// }

