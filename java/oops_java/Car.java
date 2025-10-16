package oops_java;
public class Car {
    // String make = "Ford";
    // String model = "Mustang";
    // int Year = 2025;
    // double price = 580000.99;
    // boolean isRunning = false;
    
    // void start(){
    //     System.out.println("You start the engine");
    // }

    // void stop(){
    //     System.out.println("You stop the engine");
    // }

    String make;
    String model;
    int year;
    String color;

    Car(String make,String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }


}
