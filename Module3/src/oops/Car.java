package oops;

public class Car {

    String make;
    String model;
    int year;

    // Constructor
    Car(String make, String model, int year) {

        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    void displayDetails() {

        System.out.println("Car Make  : " + make);
        System.out.println("Car Model : " + model);
        System.out.println("Car Year  : " + year);
    }
}