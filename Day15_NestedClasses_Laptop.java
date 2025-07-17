// Main public class named Day15_NestedClasses_Laptop
public class Day15_NestedClasses_Laptop {

    // Properties of Laptop
    private final String brand;
    private final String model;
    private final double price;

    // Constructor to initialize laptop details
    public Day15_NestedClasses_Laptop(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display laptop details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    // Inner class Processor
    public static class Processor {
        private final String type;
        private final double speed;

        // Constructor to initialize processor details
        public Processor(String type, double speed) {
            this.type = type;
            this.speed = speed;
        }

        // Method to display processor details
        public void displayProcessorDetails() {
            System.out.println("Processor Type: " + type);
            System.out.println("Speed: " + speed + " GHz");
        }
    }

    // Static nested class Battery
    public static class Battery {
        private final int capacity;

        // Constructor to initialize battery details
        public Battery(int capacity) {
            this.capacity = capacity;
        }

        // Method to display battery details
        public void displayBatteryDetails() {
            System.out.println("Battery Capacity: " + capacity + " mAh");
        }
    }

    // Main method to run program
    public static void main(String[] args) {

        // Creating Laptop object
        Day15_NestedClasses_Laptop laptop = new Day15_NestedClasses_Laptop("Dell", "XPS 13", 999.99);
        laptop.displayDetails(); // Display laptop info

        // Creating inner class Processor object using outer object
        Day15_NestedClasses_Laptop.Processor processor = new Processor("Intel Core i7", 3.5);
        processor.displayProcessorDetails(); // Display processor info

        // Creating static nested class Battery object (no outer object needed)
        Day15_NestedClasses_Laptop.Battery battery = new Day15_NestedClasses_Laptop.Battery(6000);
        battery.displayBatteryDetails(); // Display battery info
    }
}
