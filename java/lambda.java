public class lambda {
    public static void main(String[] args) {

        Car a = new Audi();
        System.out.println(a.getSpeed());

        Car c1 = new Car() {
            @Override
            public void drive(int speed, String model) {
                System.out.println("Driving BMW at speed " + speed);
            }
        };
        c1.drive(80, "BMW");

        Car c2 = (speed, model) -> {
            System.out.println("Driving " + model);
            System.out.println("Car is driving smoothly at speed " + speed);
            if (speed > 100)
                System.out.println("Fast driving");
            else
                System.out.println("Slow driving");
        };

        c2.drive(60, "Tata");
    }
}

class Audi implements Car {
    @Override
    public void drive(int speed, String model) {
        System.out.println("Driving " + model + " at " + speed);
    }

    @Override
    public int getSpeed() {
        System.out.println("Driving Audi");
        return 100;
    }
}

@FunctionalInterface
interface Car {
    void drive(int speed, String model);  // Only abstract method

    default int getSpeed() { 
        return 0; 
    }
}
