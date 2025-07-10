public class Day_11_1_OOPs_Constructors {

    // Properties (variables inside class)
    String brand;
    int price;

    // No-arg constructor (no inputs0

    public Day_11_1_OOPs_Constructors(){
        this.brand = "Unknown";
        this.price = 0;
    }

    // Parameterized constructor (input to set values)

    public Day_11_1_OOPs_Constructors(String brand, int price){

        this.brand = brand;
        this.price = price;
    }

    // Method to display details of car

    public void displayDetails(){
        System.out.println("Brand: "+ brand);
        System.out.println("Price: "+ price);
    }

    // Main method to run the program

    public static void main(String[] args) {
        // Objects using no-arg constructor
        Day_11_1_OOPs_Constructors car1 = new Day_11_1_OOPs_Constructors();
        System.out.println("Car1 details: ");
        car1.displayDetails();

        //Objects using parameterized constructor
        Day_11_1_OOPs_Constructors car2 = new Day_11_1_OOPs_Constructors("Tesla", 60000);
        System.out.println("\nCar2 details: ");
        car2.displayDetails();
    }
}
