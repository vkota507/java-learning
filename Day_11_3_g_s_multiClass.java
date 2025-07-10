import java.util.Scanner;

public class Day_11_3_g_s_multiClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creating Person object using parameterized constructor
        Person p1 = new Person("Varun",25);
        p1.displayDetails();

        // Creating Car object using parameterized constructor
        Car c1 = new Car("BMW", 3000000);
        c1.displayDetails();

        // using setters to update values
        p1.setName("Varun Kumar Reddy");
        c1.setPrice(3500000);

        System.out.println("\nAfter updating values using setters: ");
        System.out.println(p1.getName() + " owns a "+ c1.getBrand() + " costing "+ c1.getPrice() + " at the age "+ p1.getAge());

        input.close();
    }
}

// Class 1: Person
class Person{
    private String name;
    private int age;

    // No-arg constructor
    public Person(){
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName(){ return name; }
    public int getAge(){ return age; }

    // Setters
    public void setName(String name){ this.name = name; }
    public void setAge(int age){ this.age = age; }

    // Method to display details
    public void displayDetails(){
        System.out.println("\n--- Person Details ---");
        System.out.println("Name: "+ name);
        System.out.println("Age: " + age);
    }
}

// Class 2: Car
class Car {
    private String brand;
    private int price;

    // No-arg constructor
    public Car() {
        this.brand = "Unknown";
        this.price = 0;
    }

    // Parameterized constructor
    public Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    // Getters
    public String getBrand() { return brand; }
    public int getPrice() { return price; }

    // Setters
    public void setBrand(String brand) { this.brand = brand; }
    public void setPrice(int price) { this.price = price; }

    // Method to display details
    public void displayDetails() {
        System.out.println("\n--- Car Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}
