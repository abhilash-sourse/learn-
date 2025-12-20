public class KeywordOOPS {
    int modelYear;
    String modelName;

    // No-argument constructor
    public KeywordOOPS() {
        this(2020, "Default Model");
    }

    // Constructor with one parameter
    public KeywordOOPS(String modelName) {
        this(2020, modelName);
    }

    // Constructor with two parameters
    public KeywordOOPS(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    // Method to print car information
    public void printInfo() {
        System.out.println(modelYear + " " + modelName);
    }

    public static void main(String[] args) {
        KeywordOOPS car1 = new KeywordOOPS();
        KeywordOOPS car2 = new KeywordOOPS(1969, "Mustang");

        car1.printInfo();
        car2.printInfo();
    }
}
