import java.util.Scanner;

public class Day8_Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.print("Enter a : ");
        int a = input.nextInt();

        System.out.print("Enter b: ");
        int b = input.nextInt();

        System.out.print("Enter f: ");
        int f = input.nextInt();

        System.out.print("Enter s: ");
        int s = input.nextInt();

        System.out.print("Enter x: ");
        int x = input.nextInt();

        System.out.print("Enter y: ");
        int y = input.nextInt();


        int r1 = factorial(n);
        System.out.println("Factorial of " + n + " is: " + r1);

        int r2 = sum(n);
        System.out.println("Sum of first " + n + " numbers is: " + r2);

        int r3 = gcd(a,b);
        System.out.println("GCD of "+ a+", "+b+" is: "+ r3);

        int r4 = fibonacci(f);
        System.out.println("Fibonacci number at position "+ f + " is: "+ r4);

        int r5 = sumOfDigits(s);
        System.out.println("Sum of the digits of: "+s+" is: "+ r5);

        int r6 = power(x,y);
        System.out.println(x +" raised to the power of  "+y+" is: "+ r6);

        input.close();
    }
    // Factorial
    public static int factorial(int n) {
        if (n == 0) {  // base case
            return 1;
        } else {       // recursive case
            return n * factorial(n - 1);
        }
    }
    // Sum of 1st N numbers
    public static int sum(int n){
        if (n == 1) { //base case
            return 1;
        }else{      // recursive case
            return n + sum(n-1);
        }
    }

    // GCD of two numbers

    public static int gcd(int a,int b){
        if (b==0){
            return a; // base case
        }else{
            return gcd(b, b%a);
        }
    }

    // Fibonacci

    public static int fibonacci(int f){
        if (f==0){
            return 0;
        }else if (f==1) {
            return 1;
        }else {
            return fibonacci(f-1) + fibonacci(f-2);
        }
    }

    //Sum of the Digits

    public static int sumOfDigits(int s){
        if (s==0){
            return 0;
        }else {
            return (s%10)+sumOfDigits(s/10);
        }
    }

    //Power

    public static int power(int x, int y){
        if (y==0){
            return 1;
        }else {
            return x*power(x,y-1);
        }
    }
}

