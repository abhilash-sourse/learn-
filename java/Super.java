class Employee {
    int salary = 30000;

    void show() {
        System.out.println("Employee salary: " + salary);
    }
}

class Manager extends Employee {
    int salary = 50000;

    void show() {
        super.show();                    // parent method
        System.out.println("Manager salary: " + salary);
        System.out.println("Parent salary using super: " + super.salary);
    }
}

class Super {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.show();
    }
}
