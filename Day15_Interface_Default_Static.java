// Day15 - Default & Static Methods in Interfaces Example

// Interface Payment
interface Payment {

    // Default method: gives a common payment behaviour to all implementations
    default void pay() {
        System.out.println("Payment done (default method).");
    }

    // Default method: gives a common refund behaviour to all implementations
    default void refund() {
        System.out.println("Refund processed (default method).");
    }

    // Static method: belongs to interface itself, called using interface name
    static void printInfo() {
        System.out.println("Payment interface static method called.");
    }
}

// Implementation class CardPayment
class CardPayment implements Payment {
    // No need to override pay() and refund() unless you want different logic
}

// Main class to run the program
public class Day15_Interface_Default_Static {
    public static void main(String[] args) {
        // Creating an object of CardPayment but referring as Payment type
        Payment p = new CardPayment();

        // Calling default methods using object
        p.pay();
        p.refund();

        // Calling static method using interface name
        Payment.printInfo();
    }
}
