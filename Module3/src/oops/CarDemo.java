package oops;

public class CarDemo {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Camry", 2022);

        Car car2 = new Car("Honda", "City", 2021);

        System.out.println("=== Car 1 Details ===");
        car1.displayDetails();

        System.out.println();

        System.out.println("=== Car 2 Details ===");
        car2.displayDetails();
    }
}