import java.util.Scanner;

public class MyBio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create scanner object

        System.out.print("Enter your name: ");
        String name = input.nextLine(); // reads string input

        System.out.print("Enter your age: ");
        int age = input.nextInt(); // reads int input

        input.nextLine();

        System.out.print("Enter your stream and college name: ");
        String edu = input.nextLine(); // reads string input

        System.out.print("Enter your percentage: ");
        double percentage = input.nextDouble(); // reads double input

        System.out.print("Enter your grade: ");
        char grade = input.next().charAt(0); // reads char input

        System.out.print("Exam passed? true or false ");
        boolean isPassed = input.nextBoolean();


        System.out.println("Name: " + name + ", is " + age + " years old. Studied " + edu + ". Having a percentage of " + percentage + ".");


    }
}
