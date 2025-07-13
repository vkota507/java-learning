class Animals {
    final void eat() {
        System.out.println("Animal eats food");
    }
}

class Dogs extends Animals {
    // void eat() { // ❌ This gives error: Cannot override final method
    //     System.out.println("Dog eats bones");
    // }
}

public class Day13_FinalKeyword_Method {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.eat(); // Calls Animal's final method
    }
}
