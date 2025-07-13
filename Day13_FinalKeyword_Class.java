final class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

// class Car extends Vehicle { // ❌ Error: Cannot inherit from final class Vehicle
// }

public class Day13_FinalKeyword_Class {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run();
    }
}
