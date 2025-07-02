import java.util.Scanner;

public class Day10_1_Car_class {
    // Attributes of the Car class
    String brand;
    String model;
    int year;
    double price;

    // Constructor to initialize the Car object

    public Day10_1_Car_class(String brand, String model, int year, double price) {
        this.brand = brand; // 'this.brand' refers to the instance variable
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display car details

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }

    // Method to calculate discounted price
    public double DiscountedPrice(double discountPercentage) {
        return price - (price * discountPercentage / 100);
    }

    // Main method to run the program

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Tool to take user input

        // Ask how many cars
        System.out.print("Enter number of cars: ");
        int n = input.nextInt();
        input.nextLine(); // consume leftover newline

        // Create an array to store Car objects
        Day10_1_Car_class[] cars = new Day10_1_Car_class[n];

        // Loop to take input for each car
        for (int i = 0; i < n; i++) {
            System.out.println("\nEntering details for Car " + (i + 1));

            System.out.print("Enter brand: ");
            String brand = input.nextLine();

            System.out.print("Enter model: ");
            String model = input.nextLine();

            System.out.print("Enter year: ");
            int year = input.nextInt();

            System.out.print("Enter price: ");
            double price = input.nextDouble();
            input.nextLine(); // consume leftover newline

            // Create Car object and store in array
            cars[i] = new Day10_1_Car_class(brand, model, year, price);
        }

        // Display details of all cars
        System.out.println("\n--- All Car Details ---");
        for (Day10_1_Car_class car : cars) {
            car.displayDetails();
            System.out.println("Discounted Price (10% off): Rs" + car.DiscountedPrice(10));
            System.out.println("-------------------------");
        }

        input.close();
    }
}
