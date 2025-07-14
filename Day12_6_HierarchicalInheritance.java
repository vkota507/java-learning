import java.util.Scanner;
// Dog’s name, age, breed, Cat’s name, age, color

// Hierarchical Inheritance Example
public class Day12_6_HierarchicalInheritance {
    // Base class
    static class Animal {
        String name;
        int age;

        public void showDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    // Dog class extending Animal
    static class Dog extends Animal {
        String breed;

        public void showDogDetails() {
            System.out.println("Dog Details:");
            showDetails(); // calls Animal method
            System.out.println("Breed: " + breed);
        }
    }

    // Cat class extending Animal
    static class Cat extends Animal {
        String color;

        public void showCatDetails() {
            System.out.println("Cat Details:");
            showDetails(); // calls Animal method
            System.out.println("Color: " + color);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creating Dog object
        Dog dog = new Dog();
        System.out.print("Enter dog's name: ");
        dog.name = input.nextLine();
        System.out.print("Enter dog's age: ");
        dog.age = input.nextInt();
        input.nextLine(); // consume newline
        System.out.print("Enter dog's breed: ");
        dog.breed = input.nextLine();

        // Creating Cat object
        Cat cat = new Cat();
        System.out.print("Enter cat's name: ");
        cat.name = input.nextLine();
        System.out.print("Enter cat's age: ");
        cat.age = input.nextInt();
        input.nextLine(); // consume newline
        System.out.print("Enter cat's color: ");
        cat.color = input.nextLine();

        // Display details
        System.out.println("\n---- Animal Details ----");
        dog.showDogDetails();
        cat.showCatDetails();

        input.close(); // closing scanner
    }
}
