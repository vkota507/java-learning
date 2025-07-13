public class Day13_FinalKeyword_Variable {
    public static void main(String[] args) {
        final int x = 10;
        System.out.println("x = " + x);

        // x = 20; // ❌ This line would give error because x is final
    }
}
