// Day15_MultipleInterfaces.java
// Example: Implementing multiple interfaces in a single class

// First interface with one method
interface Interface1 {
    void methodA(); // This method must be implemented by any class that implements Interface1
}

// Second interface with one method
interface Interface2 {
    void methodB(); // This method must be implemented by any class that implements Interface2
}

// This class implements both Interface1 and Interface2
class MultiInterfaceClass implements Interface1, Interface2 {

    // Implementing methodA from Interface1
    public void methodA() {
        System.out.println("methodA() from Interface1 is called");
    }

    // Implementing methodB from Interface2
    public void methodB() {
        System.out.println("methodB() from Interface2 is called");
    }
}

// Main class to run the program
public class Day15_MultipleInterfaces {
    public static void main(String[] args) {
        // Creating object of MultiInterfaceClass
        MultiInterfaceClass obj = new MultiInterfaceClass();

        // Calling both methods
        obj.methodA(); // Calls method from Interface1
        obj.methodB(); // Calls method from Interface2
    }
}
