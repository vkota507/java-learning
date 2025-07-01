import java.util.Scanner;

public class Day9_2_OOPs_class_Employee {

    int empid;
    String name;
    int salary;

    public Day9_2_OOPs_class_Employee(int empid, String name, int salary){
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("EmpID: "+ empid);
        System.out.println("Name: "+ name);
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = input.nextInt();
        input.nextLine();

        Day9_2_OOPs_class_Employee[] employees = new Day9_2_OOPs_class_Employee[n];

        for (int i =0; i<n;i++){
            System.out.println("\nEntering details for Employee "+ (i+1));

            System.out.print("Enter empid: ");
            int empid = input.nextInt();
            input.nextLine();

            System.out.print("Enter name: ");
            String name = input.nextLine();

            System.out.print("Enter salary: ");
            int salary = input.nextInt();
            input.nextLine();

            employees[i] = new Day9_2_OOPs_class_Employee(empid, name, salary);
        }

        System.out.println("\n---- All Employees Details ---");
        for (int i =0; i<n;i++){
            System.out.println("\n Employee "+(i+1)+" details");
            employees[i].displayDetails();
        }

        input.close();
    }
}
