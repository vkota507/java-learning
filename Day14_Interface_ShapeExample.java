import java.util.Scanner;

// This is an interface defining what all shapes should do
interface Shapes {
    double calculateArea();      // Method to calculate area
    double calculatePerimeter(); // Method to calculate perimeter
}

// Circle class implements Shape interface
class Circles implements Shapes {
    double radius; // property of Circle

    // Constructor to set radius when creating Circle object
    public Circles(double radius) {
        this.radius = radius;
    }

    // Implementing calculateArea method from Shape interface
    public double calculateArea() {
        return Math.PI * radius * radius; // formula: πr²
    }

    // Implementing calculatePerimeter method from Shape interface
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // formula: 2πr
    }
}

// Rectangle class implements Shape interface
class Rectangle implements Shapes {
    double length, width; // properties of Rectangle

    // Constructor to set length and width when creating Rectangle object
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing calculateArea method
    public double calculateArea() {
        return length * width; // formula: l x w
    }

    // Implementing calculatePerimeter method
    public double calculatePerimeter() {
        return 2 * (length + width); // formula: 2(l+w)
    }
}

// This is the main class where execution starts
public class Day14_Interface_ShapeExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user to choose shape
        System.out.println("Choose shape:\n1. Circle\n2. Rectangle");
        int choice = input.nextInt();

        // Declaring reference of type Shape (interface)
        Shapes s = null;

        if (choice == 1) {
            // If user chooses Circle, take radius input
            System.out.print("Enter radius: ");
            double radius = input.nextDouble();
            s = new Circles(radius); // creating Circle object
        } else if (choice == 2) {
            // If user chooses Rectangle, take length and width input
            System.out.print("Enter length: ");
            double length = input.nextDouble();
            System.out.print("Enter width: ");
            double width = input.nextDouble();
            s = new Rectangle(length, width); // creating Rectangle object
        } else {
            // If invalid choice entered
            System.out.println("Invalid choice!");
            System.exit(0);
        }

        // Calling methods to display area and perimeter
        System.out.println("Area: " + s.calculateArea());
        System.out.println("Perimeter: " + s.calculatePerimeter());

        input.close(); // closing Scanner object
    }
}
