import java.util.Scanner;

public class Day12_8_Super_Constructor {

    static class Person {
        String name;
        int age;

        // Constructor for Person
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void showDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    static class Employee extends Person {
        int empId;
        double salary;

        // Constructor for Employee that calls the super constructor
        public Employee(String name, int age, int empId, double salary) {
            super(name, age); // Calls Person's constructor
            this.empId = empId;
            this.salary = salary;
        }

        public void showDetails() {
            super.showDetails(); // Calls parent (Person) showDetails() method
            System.out.println("EmpID: " + empId);
            System.out.println("Salary: " + salary);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking employee details as input
        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter employee ID: ");
        int empId = input.nextInt();

        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        // Creating Employee object using the constructor
        Employee e1 = new Employee(name, age, empId, salary);

        // Calling overridden showDetails()
        System.out.println("\n--- Employee Details ---");
        e1.showDetails();

        input.close();
    }
}
