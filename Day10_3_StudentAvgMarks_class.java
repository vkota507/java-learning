import java.util.Scanner;

public class Day10_3_StudentAvgMarks_class {
    // Attributes of the Student class
    String name;
    int rollNumber;
    double[] marks;

    // Constructor to initialize the Student object

    public Day10_3_StudentAvgMarks_class(String name, int rollNumber, double[] marks){
        this.name = name; // 'this.name' refers to the instance variable
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display student details

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.print("Marks: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

    // Method to calculate average marks
    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    // Main method to run the program

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Tool to take user input

        // Ask how many students
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        input.nextLine(); // consume leftover newline

        // Create an array to store Student objects
        Day10_3_StudentAvgMarks_class[] students = new Day10_3_StudentAvgMarks_class[n];

        // Loop to take input for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEntering details for Student " + (i + 1));

            System.out.print("Enter name: ");
            String name = input.nextLine();

            System.out.print("Enter roll number: ");
            int rollNumber = input.nextInt();

            System.out.print("Enter number of subjects: ");
            int numSubjects = input.nextInt();
            double[] marks = new double[numSubjects];

            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[j] = input.nextDouble();
            }
            input.nextLine(); // consume leftover newline

            // Create a new Student object and add it to the array
            students[i] = new Day10_3_StudentAvgMarks_class(name, rollNumber, marks);
        }

        // Display details and average marks for each student
        for (Day10_3_StudentAvgMarks_class student : students) {
            student.displayDetails();
            System.out.println("Average Marks: " + student.calculateAverage());
            System.out.println("-----------------------------");
            System.out.println("-----------------------------");
        }

        input.close(); // Close the scanner
    }
}
