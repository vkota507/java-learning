import java.util.Scanner;

public class Day1_Tasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Uncomment the task you want to run

        //task1_VotingEligibility(input);
        //task2_PassFail(input);
        //task3_Grading(input);
        //task4_CompareTwoNumbers(input);
        //task5_Calc_if_else(input);
        //task6_Calc_switch_case(input);

        input.close();
    }
        public static void task1_VotingEligibility(Scanner input) {
            System.out.print("Enter you age: ");
            int age = input.nextInt();

            if (age >= 18) {
                System.out.println("You are eligible for voting.");
            }
            else {
                System.out.println("You are not eligible for voting.");
            }
        }


        public static void task2_PassFail(Scanner input) {
            System.out.print("Enter your marks: ");
            int marks = input.nextInt();

            if (marks >= 35) {
                System.out.println("Passed");
            }
            else {
                System.out.println("Failed");
            }
        }

        public static void task3_Grading(Scanner input) {
            System.out.print("Enter your marks: ");
            int marks = input.nextInt();

            if (marks >= 90){
                System.out.println("You got A grade");
            } else if (marks >= 75) {
                System.out.println("You got B grade");
            } else if (marks >= 60) {
                System.out.println("You got C grade");
            }else {
                System.out.println("You got F grade");
            }

        }

        public static void task4_CompareTwoNumbers(Scanner input) {
            System.out.print("Enter num1: ");
            int num1 = input.nextInt();

            System.out.print("Enter num2: ");
            int num2 = input.nextInt();

            if (num1 > num2) {
                System.out.println("num1 is greater");
            }else if ( num1 < num2 ) {
                System.out.println("num2 is greater");
            }else {
                System.out.println("num1 = num2");
            }
        }

        public static void task5_Calc_if_else(Scanner input) {
            System.out.print("Enter num1: ");
            int num1 = input.nextInt();

            System.out.print("Enter num2: ");
            int num2 = input.nextInt();

            System.out.print("Enter operator (+,-,*,/): ");
            char op = input.next().charAt(0);

            if (op == '+'){
                System.out.println(num1 + num2);
            } else if (op == '-') {
                System.out.println(num1 - num2);
            } else if (op == '*') {
                System.out.println(num1 * num2);
            } else if (op == '/') {
                System.out.println(num1 / num2);
            } else {
                System.out.println("select the right operator");
            }
        }

        public static void task6_Calc_switch_case(Scanner input){
            System.out.print("Enter num1: ");
            int num1 = input.nextInt();

            System.out.print("Enter num2: ");
            int num2 = input.nextInt();

            System.out.print("Enter operator (+,-,*,/): ");
            char op = input.next().charAt(0);

            switch (op) {
                case '+':
                    System.out.println(num1 + num2);
                    break;

                case '-':
                    System.out.println(num1-num2);
                    break;

                case '*':
                    System.out.println(num1*num2);
                    break;

                case '/':
                    if (num2 != 0){
                        System.out.println(num1/num2);
                    } else{
                        System.out.println("cannot divide by zero");
                    }
                    break;

                default:
                    System.out.println("Invalid operator");
            }
        }

}
