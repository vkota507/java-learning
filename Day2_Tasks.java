import java.util.Scanner;

public class Day2_Tasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Uncomment the task you want to run
        //task_while(input);
        //task_do_while(input);
        //task_for(input);

        task_pattern(input);

        input.close();
    }

    public static void task_while(Scanner input){
        int count = 1;
        while (count <= 5){
            System.out.println("Count is: " + count);
            count++;
        }
    }

    public static void task_do_while(Scanner input){
        int count = 10;
        do {
            System.out.println("Count is: " + count);
            count--;
        }while (count >= 5);
    }

    public static void task_for(Scanner input){
        System.out.print("How many even numbers to print: ");
        int n = input.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.println("Even number:"+ i + " : " + (i*2));
        }
    }

    public static void task_pattern(Scanner input){
        System.out.print("How many rows you need: ");
        int r = input.nextInt();

        for (int i=1; i<=r; i++){ // outer loop for rows
           for(int j =1; j<=i; j++){ //inner loop for columns/starts in each row
               System.out.print("* ");
           }
           System.out.println();
        }
    }
}
