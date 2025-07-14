import java.util.Scanner;

public class Day12_9_SuperKeyword_Methods {

    static class Person {
        String name;
        int age;

        public void showDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    static class Employee extends Person {
        int empId;
        double salary;

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

        // Creating Employee object
        Employee e1 = new Employee();
        e1.name = name;
        e1.age = age;
        e1.empId = empId;
        e1.salary = salary;

        // Calling overridden showDetails()
        System.out.println("\n--- Employee Details ---");
        e1.showDetails();

        input.close();
    }
}
