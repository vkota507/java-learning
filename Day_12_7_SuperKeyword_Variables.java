import java.util.Scanner;

// Super Keyword Example
public class Day_12_7_SuperKeyword_Variables {

    // Parent class

    static class Person{
        String role;
        int age;

        public void showDetails() {
            System.out.println("Role: " + role);
            System.out.println("Age: " + age);
        }
    }
    // Child class

    static class Employee extends Person{
        String department;

        // Constructor to initialize variables
        public Employee(String role, int age, String department) {
            super.role = role; // Using super to access parent class variable
            super.age = age;   // Using super to access parent class variable
            this.department = department; // Using this to access child class variable
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creating Employee object
        System.out.print("Enter employee's role: ");
        String role = input.nextLine();
        System.out.print("Enter employee's age: ");
        int age = input.nextInt();
        input.nextLine(); // consume newline
        System.out.print("Enter employee's department: ");
        String department = input.nextLine();

        Employee emp = new Employee(role, age, department);

        // Displaying details
        System.out.println("\nEmployee Details:");
        emp.showDetails(); // Calls parent class method
        System.out.println("Department: " + emp.department); // Accessing child class variable
    }
}
