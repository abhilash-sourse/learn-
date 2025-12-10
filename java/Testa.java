//final keyword
final class Vehicle {      // cannot be inherited
    final int speed = 100; // constant variable

    final void display() { // cannot be overridden
        System.out.println("Speed: " + speed);
    }
}

class Testa {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.display();
    }
}
