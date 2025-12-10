abstract class Shape {
    abstract void draw();       // abstract method

    void info() {               // normal method
        System.out.println("Shapes have different forms");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Aabstracts {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.info();
    }
}
