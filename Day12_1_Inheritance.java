class PersonBasic {
    String name;
    int age;

    public void showDetails() {
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }
}

class Employee extends PersonBasic {
    int empId;
    double salary;

    public void showEmployeeDetails() {
        showDetails(); // calling Person method
        System.out.println("EmpID: "+ empId);
        System.out.println("Salary: "+ salary);
    }
}

public class Day12_1_Inheritance {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Varun";
        e1.age = 25;
        e1.empId = 101;
        e1.salary = 50000;

        e1.showEmployeeDetails();
    }
}



