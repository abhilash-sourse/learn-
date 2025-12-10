// static keyword
class Student {
    static String college = "ABC College"; // static variable
    int roll;

    Student(int r) { roll = r; }

    static void showCollege() {          // static method
        System.out.println("College: " + college);
    }

    void show() {
        System.out.println("Roll: " + roll);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(2);

        Student.showCollege();
        s1.show();
        s2.show();
    }
}
