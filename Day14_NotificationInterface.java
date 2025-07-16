// Interface Notification with abstract, default, and static methods
interface Notification {

    // Abstract method - must be implemented by any class
    void send(String message);

    // Default method - has a body; classes can use or override it
    default void greet() {
        System.out.println("Sending Notification...");
    }

    // Static method - belongs to interface itself, called via interface name
    static void info() {
        System.out.println("Notifications module v1.0");
    }
}

// Class implementing Notification interface
class EmailNotification implements Notification {

    // Implementing the abstract send() method
    public void send(String message) {
        System.out.println("Email sent with message: " + message);
    }
}

// Main class to run the program
public class Day14_NotificationInterface {
    public static void main(String[] args) {

        // Creating an object of EmailNotification
        EmailNotification email = new EmailNotification();

        // Calling the default method from interface
        email.greet(); // prints "Sending Notification..."

        // Calling the implemented abstract method
        email.send("Your order has been shipped!"); // prints email message

        // Calling the static method from interface
        Notification.info(); // prints "Notifications module v1.0"
    }
}
