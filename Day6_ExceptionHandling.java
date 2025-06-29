import java.util.Scanner;

public class Day6_ExceptionHandling {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Uncomment one by one to practice
         divideByZeroExample();
         arrayIndexExample();
         multipleCatchExample();
         numberFormatExample();
         finallyExample();
         nestedTryCatchExample();
         genericExceptionExample();

        input.close(); // closing scanner at the end

    }

    //1. Divide by zero (ArithmeticException)

    public static void divideByZeroExample(){
        try {
            System.out.print("Enter numerator: ");
            int a = input.nextInt();

            System.out.print("Enter denominator: ");
            int b = input.nextInt();

            int result = a/b;
            System.out.println("Result: "+ result);
        } catch (ArithmeticException e){
            System.out.println("you cannot divide by zero!");
        }
    }

    //2. Invalid array index(ArrayIndexOutOfBoundsException)

    public static void arrayIndexExample(){
        System.out.print("Enter size of array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter "+ size + " elements");
        for (int i = 0; i<size; i++){
            numbers[i] = input.nextInt();
        }

        try {
            System.out.print("Enter index to access: ");
            int idx = input.nextInt();
            System.out.println("value at index "+ idx + " is: "+ numbers[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index accessed!");
        }
    }

    //3. Multiple Catch blocks

    public static void multipleCatchExample(){
        try {
            System.out.print("Enter number to divide 10 by: ");
            int n = input.nextInt();

            int a = 10/n; // may cause ArithmeticException

            System.out.print("Enter any string: ");
            String s = input.next();
            System.out.println("Length of string: "+ s.length()); // my cause NullPointerException if s=null manually set
        } catch (ArithmeticException e){
            System.out.println("Division by zero not allowed.");
        } catch (NullPointerException e){
            System.out.println("Null reference accessed.");
        }
    }

    //4. NumberFormatException

    public static void numberFormatExample(){
        try{
            System.out.print("Enter a number as a string: ");
            String s = input.next();

            int num = Integer.parseInt(s);
            System.out.println("Number entered: "+ num);
        } catch (NumberFormatException e){
            System.out.println("Invalid number format entered");
        }
    }

    //5. Finally Block Usage

    public static void finallyExample(){
        try {
            System.out.print("Enter any number: ");
            int n = input.nextInt();
            int a = 5/n;
            System.out.println("Result is: "+ a);
        } catch (ArithmeticException e){
            System.out.println("Division by zero not allowed.");
        } finally {
            System.out.println("Finally block always runs.");
        }
    }

    //6. Nested try-catch

    public static void nestedTryCatchExample(){
        try {
            try {
                System.out.print("Enter a number to divide 100 by: ");
                int n = input.nextInt();
                int a = 100/n;
                System.out.println("Result: "+ a);
            }catch (ArithmeticException e){
                System.out.println("Inner catch: Division by zero");
            }

            System.out.print("Enter any string to find its length: ");
            String s = input.next();
            System.out.println("Length: "+ s.length());
        } catch (NullPointerException e){
            System.out.println("Outer catch: Null pointer");
        }
    }

    //7. Catching Exeption superclass (generic)

    public static void genericExceptionExample(){
        try {
            System.out.print("Enter array size: ");
            int size = input.nextInt();

            int[] arr = new int[size];
            System.out.print("Enter index to access: ");
            int idx = input.nextInt();

            System.out.println("value at index: "+ arr[idx]);
        } catch (Exception e){
            System.out.println("Some exception occured: "+ e);
        }
    }

}
