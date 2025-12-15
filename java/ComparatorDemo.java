// import java.util.*;

// class Student implements Comparable<Student> {
//     int id;
//     String name;

//     Student(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public int compareTo(Student s) {
//         return this.id - s.id; // ascending order
//     }
// }

// public class ComparableDemo {
//     public static void main(String[] args) {

//         ArrayList<Student> list = new ArrayList<>();
//         list.add(new Student(3, "Abhi"));
//         list.add(new Student(1, "Rahul"));
//         list.add(new Student(2, "Anu"));

//         Collections.sort(list);

//         for (Student s : list) {
//             System.out.println(s.id + " " + s.name);
//         }
//     }
// }


// 2 method

import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(3, "Abhi"));
        list.add(new Student(1, "Rahul"));
        list.add(new Student(2, "Anu"));

        Collections.sort(list, new NameComparator());

        for (Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}
