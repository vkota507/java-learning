
class AreaCalculator{

    // Method to calculate area of a square
    public double calculateArea(double side) {
        return side * side;
    }

    // Method to calculate area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate area of a circle
    public double calculateArea(int radius) {
                  return 3.14 * radius * radius;
    }
}

public class Day13_Polymorphism_Overloading_Task1 {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        // Calculate area of a square
        double squareArea = areaCalculator.calculateArea(5.0);
        System.out.println("Area of square: " + squareArea);

        // Calculate area of a rectangle
        double rectangleArea = areaCalculator.calculateArea(4.0, 6.0);
        System.out.println("Area of rectangle: " + rectangleArea);

        // Calculate area of a circle
        double circleArea = areaCalculator.calculateArea(3);
        System.out.println("Area of circle: " + circleArea);
    }
}
