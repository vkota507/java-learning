import java.util.Scanner;

public class Day12_3_Bank_Inheritance {

    // Base class Bank Account
    static class BankAccount{
        String accNumber;
        int balance;

        public void showAccDetails() {
            System.out.println("Account Number: " + accNumber);
            System.out.println("Balance: " + balance);
        }
    }

    // Derived class SavingsAccount extending BankAccount
    static class SavingsAccount extends BankAccount{
        double interestRate;

        public void showSavingsDetails() {
            showAccDetails(); // calls BankAccount method
            System.out.println("Interest Rate: " + interestRate + "%");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creating savings account object
        SavingsAccount sa = new SavingsAccount();

        // Taking input from user
        System.out.print("Enter account number: ");
        sa.accNumber = input.nextLine();

        System.out.print("Enter account balance: ");
        sa.balance = input.nextInt();

        input.nextLine();

        System.out.print("Enter interest rate: ");
        sa.interestRate = input.nextDouble();

        // Display savings account details
        System.out.println("\n---- Savings Account Details ----");
        sa.showSavingsDetails();

        input.close(); // closing scanner
    }

}
