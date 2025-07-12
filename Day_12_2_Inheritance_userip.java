import java.util.Scanner;

public class Day_12_2_Inheritance_userip {

    // Base class Person
    static class Person {
        String name;
        int age;

        public void showDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    // Derived class Employee extending Person
    static class Employee extends Person {
        int empId;
        double salary;

        public void showEmployeeDetails() {
            showDetails(); // calls Person method
            System.out.println("EmpID: " + empId);
            System.out.println("Salary: " + salary);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creating employee object
        Employee e1 = new Employee();

        // Taking input from user
        System.out.print("Enter name: ");
        e1.name = input.nextLine();

        System.out.print("Enter age: ");
        e1.age = input.nextInt();

        System.out.print("Enter empId: ");
        e1.empId = input.nextInt();

        System.out.print("Enter salary: ");
        e1.salary = input.nextDouble();

        // Display employee details
        System.out.println("\n---- Employee Details ----");
        e1.showEmployeeDetails();

        input.close(); // closing scanner
    }
}
