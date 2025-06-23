import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner Object

        System.out.print("Enter your name: ");
        String name = input.nextLine(); // Read string input

        System.out.print("Enter your age: ");
        int age = input.nextInt(); // read int input

        System.out.println("Hello " + name + ", you are " + age + " year old.");
    }
}
