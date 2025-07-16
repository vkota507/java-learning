import java.util.Scanner;

abstract class Day14_Vehicle {
    abstract void move(); // abstract method

    void start() { // normal method
        System.out.println("Vehicle is starting...");
    }
}

class Bike extends Day14_Vehicle {
    void move() {
        System.out.println("Bike is moving on two wheels.");
    }
}

class Day14_Car extends Day14_Vehicle {
    void move() {
        System.out.println("Car is moving on four wheels.");
    }
}

public class Day14_Abstraction_Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Choose vehicle (bike/car): ");
        String choice = input.nextLine();

        Day14_Vehicle v; // reference of abstract class

        if (choice.equalsIgnoreCase("bike")) {
            v = new Bike();
        } else if (choice.equalsIgnoreCase("car")) {
            v = new Day14_Car();
        } else {
            System.out.println("Invalid choice.");
            input.close();
            return;
        }

        v.start(); // calling normal method
        v.move();  // calling abstract method's implementation

        input.close();
    }
}
