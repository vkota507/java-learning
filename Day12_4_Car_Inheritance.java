import java.util.Scanner;

public class Day12_4_Car_Inheritance {

    // Base class Vehicle
    static class Vehicle{
        String brand;
        int price;

        public void showDetails() {
            System.out.println("Brand: " + brand);
            System.out.println("Price: " + price);
        }
    }

    // Derived class Car extending Vehicle
    static class Car extends Vehicle{
        String model;
        int speed;

        public void showCarDetails() {
            showDetails(); // calls Vehicle method
            System.out.println("Model: " + model);
            System.out.println("Speed: " + speed + " km/h");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creating car object
        Car car1 = new Car();

        // Taking input from user
        System.out.print("Enter car brand: ");
        car1.brand = input.nextLine();

        System.out.print("Enter car price: ");
        car1.price = input.nextInt();

        input.nextLine(); // consume newline

        System.out.print("Enter car model: ");
        car1.model = input.nextLine();

        System.out.print("Enter car speed: ");
        car1.speed = input.nextInt();

        // Display car details
        System.out.println("\n---- Car Details ----");
        car1.showCarDetails();

        input.close(); // closing scanner
    }
}
