import java.util.Scanner;

public class Day3_Revision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        task_reverse_a_number(input);
        task_even_numbers_1_to_N(input);



        input.close();
    }


    public static void task_reverse_a_number(Scanner input){
        System.out.print("Enter the any 4 ro above digit number: ");
        int n = input.nextInt();
        int reversed = 0;

        while(n != 0){
            int lastdigit = n % 10;
            reversed = reversed * 10 + lastdigit;
            n = n/10;

        }
        System.out.println("The reversed number is: "+ reversed);
    }

    public static void task_even_numbers_1_to_N(Scanner input) {
        System.out.print("Enter the number N: ");
        int n = input.nextInt();

        System.out.print("Even numbers between 1 and " + n + " are: ");

        for (int i = 1; i <= n / 2; i++) {
            System.out.print((i * 2) + " ");
        }

        System.out.println(); // for newline after printing list
    }

}
