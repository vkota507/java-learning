import java.util.Scanner;

public class Day10_2_BankAcc_class {

    // Attributes of the Bank Account class
    String accountNumber;
    String accountHolderName;
    double balance;

    // Constructor to initialize the Bank Account object

    public Day10_2_BankAcc_class(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber; // 'this.accountNumber' refers to the instance variable
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to display account details

    public void displayDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    // Method to deposit money into the account

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Ask how many accounts
        System.out.print("Enter number of accounts: ");
        int n = input.nextInt();
        input.nextLine();

        // Create an array to store Bank Account objects
        Day10_2_BankAcc_class[] accounts = new Day10_2_BankAcc_class[n];

        // Loop to take input for each account
        for (int i = 0; i < n; i++) {
            System.out.println("\nEntering details for Account " + (i + 1));

            System.out.print("Enter account number: ");
            String accountNumber = input.nextLine();

            System.out.print("Enter account holder name: ");
            String accountHolderName = input.nextLine();

            System.out.print("Enter initial balance: ");
            double balance = input.nextDouble();
            input.nextLine(); // consume leftover newline

            // Create a new Bank Account object and store it in the array
            accounts[i] = new Day10_2_BankAcc_class(accountNumber, accountHolderName, balance);
        }

        // Display details of each account
        System.out.println("\nAccount Details:");
        for (Day10_2_BankAcc_class account : accounts) {
            account.displayDetails();
            System.out.println("-------------------------");
        }

        input.close();
    }
}
