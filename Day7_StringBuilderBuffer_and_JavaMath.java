import java.util.Scanner;

public class Day7_StringBuilderBuffer_and_JavaMath {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Uncomment to test each method step by step
        //stringBuilderDemo();
        // stringBufferDemo();
        javaMath();

        input.close();
    }

    public static void stringBuilderDemo() {
        System.out.println("🔷 StringBuilder Demo");

        System.out.print("Enter your base string: ");
        String str = input.nextLine();

        StringBuilder sb = new StringBuilder(str);
        System.out.println("Initial StringBuilder: " + sb);

        // Append
        System.out.print("Enter something to append: ");
        sb.append(input.nextLine());
        System.out.println("After append: " + sb);

        // Insert
        System.out.print("Enter position to insert at: ");
        int pos = input.nextInt();
        input.nextLine(); // consume newline

        System.out.print("Enter string to insert: ");
        String toInsert = input.nextLine();
        sb.insert(pos, toInsert);
        System.out.println("After insert: " + sb);

        // Replace
        System.out.print("Enter start and end index to replace: ");
        int start = input.nextInt();
        int end = input.nextInt();
        input.nextLine();

        System.out.print("Enter replacement string: ");
        String rep = input.nextLine();
        sb.replace(start, end, rep);
        System.out.println("After replace: " + sb);

        // Delete
        System.out.print("Enter start and end index to delete: ");
        int delStart = input.nextInt();
        int delEnd = input.nextInt();
        sb.delete(delStart, delEnd);
        System.out.println("After delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }

    public static void stringBufferDemo() {
        System.out.println("🔷 StringBuffer Demo");

        System.out.print("Enter your base string: ");
        String str = input.nextLine();

        StringBuffer sb = new StringBuffer(str);
        System.out.println("Initial StringBuffer: " + sb);

        // Similar methods as StringBuilder
        sb.append(" buffer");
        System.out.println("After append: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);



    }

    public static void javaMath(){
        System.out.println(Math.abs(-25));     // 25
        System.out.println(Math.max(5, 10));   // 10
        System.out.println(Math.sqrt(49));     // 7.0
        System.out.println(Math.pow(2, 5));    // 32.0
        System.out.println(Math.round(5.8));   // 6
        System.out.println(Math.ceil(4.2));    // 5.0
        System.out.println(Math.floor(4.8));   // 4.0
        System.out.println(Math.random());     // e.g. 0.53829
        System.out.println(Math.round(Math.random()*(9999-1000+1)+1000));     // e.g. 0.53829
    }
}

