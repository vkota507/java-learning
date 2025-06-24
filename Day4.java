import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        task_pattern_rt_triangle(input);
        task_pattern_menu(input);

        input.close();
    }

    public static void task_pattern_rt_triangle(Scanner input){
        System.out.print("How many rows to print: ");
        int r = input.nextInt();

        for (int i = 1; i <= r; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void task_pattern_invrt_triangle(Scanner input){
        System.out.print("How many rows to print: ");
        int n = input.nextInt();

        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void task_pattern_number_triangle(Scanner input){
        System.out.print("How many rows to print: ");
        int r = input.nextInt();

        for (int i = 1; i <= r; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void task_even_numbers_1_to_N(Scanner input) {
        System.out.print("Enter the number N: ");
        int n = input.nextInt();

        System.out.print("Even numbers between 1 and " + n + " are: ");

        for (int i = 1; i <= n / 2; i++) {
            System.out.print((i * 2) + " ");
        }

        System.out.println();
    }

    public static void task_pattern_menu(Scanner input){
        System.out.println("Choose an option: ");
        System.out.println("1 -> Print even numbers upto N");
        System.out.println("2 -> Print inverted star triangle");
        System.out.println("3 -> Print number triangle pattern");

        int choice = input.nextInt();

        switch (choice){
            case 1:
                task_even_numbers_1_to_N(input);
                break;

            case 2:
                task_pattern_invrt_triangle(input);
                break;

            case 3:
                task_pattern_number_triangle(input);
                break;

            default:
                System.out.println("Invalid option");
        }
    }
}
