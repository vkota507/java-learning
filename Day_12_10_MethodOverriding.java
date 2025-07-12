import java.util.Scanner;

// Parent class
class Shape {
    public void area() {
        System.out.println("Area formula not defined for generic shape");
    }
}

// Child class Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Overriding area() method
    public void area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Child class Square
class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    // Overriding area() method
    public void area() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}

public class Day_12_10_MethodOverriding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Circle input and area
        System.out.print("Enter radius of circle: ");
        double radius = input.nextDouble();
        Circle c1 = new Circle(radius);
        // Calls Circle's overridden method
        c1.area();

        // Square input and area
        System.out.print("Enter side of square: ");
        double side = input.nextDouble();
        Square s1 = new Square(side);
        s1.area(); // Calls Square's overridden method

        input.close();
    }
}
