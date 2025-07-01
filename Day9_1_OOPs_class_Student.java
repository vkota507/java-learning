import java.util.Scanner; // This helps us take input from the user

// We are creating a blueprint called Student under Day9_OOPs_Intro
public class Day9_1_OOPs_class_Student {

    // These are like the student's details or properties
    String name;
    int age;
    char grade;

    // This is a special function called Constructor
    // It runs automatically when we create a Student

    public Day9_1_OOPs_class_Student(String name, int age, char grade){
        this.name = name; // 'this.name' means the variable above (property)
        this.age = age; // We are giving values to the student's properties
        this.grade = grade;
    }

    // This is a normal function to show student details
    public void displayDetails() {
        System.out.println("Name: "+ name); // Shows name
        System.out.println("Age: "+ age); // shows age
        System.out.println("Grade: "+ grade); // shows grade
    }

    // This is the main function where our program starts running

    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Making a tool to take input

        // Ask how many students
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        input.nextLine(); // consume leftover newline


        // Create an array to store all students
        Day9_1_OOPs_class_Student[] students = new Day9_1_OOPs_class_Student[n];

        // Loop to take input for each student
        for (int i = 0; i<n;i++){
            System.out.println("\nEntering details for Student "+ (i+1));

            System.out.print("Enter name: ");
            String name = input.nextLine(); // Taking name from user

            System.out.print("Enter age: ");
            int age = input.nextInt(); // Taking age from user

            System.out.print("Enter grade: ");
            char grade = input.next().charAt(0); // Taking grade from user
            input.nextLine(); // consume leftover newline

            // Create student object and store in array
            students[i] = new Day9_1_OOPs_class_Student(name, age, grade);
        }

        // Display details of all students
        System.out.println("\n--- All Student Details ---");
        for (int i = 0; i<n; i++){
            System.out.println("\nStudent "+ (i+1)+ " details");
            students[i].displayDetails();
        }

        input.close(); // Closing the input tool as good habit
    }
}
