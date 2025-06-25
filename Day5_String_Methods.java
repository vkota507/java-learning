import java.util.Scanner;

public class Day5_String_Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  str = " Hello Java World";
        String str2 = "hello java world";

        //1. Length()
        System.out.println("1. Length: "+ str.length()); // includes spaces

        //2. Trim()
        System.out.println("2. Trimed: '"+ str.trim()+ "'");

        //3. toUpperCase() and toLowerCase()
        System.out.println("3. Uppercase: "+ str.toUpperCase());
        System.out.println("3. Lowercase: "+ str.toLowerCase());

        //4. equals() and equalsIgnoreCase()
        System.out.println("5. Equals: "+ str.equals(str2)); //false
        System.out.println("6. Equals Ignore Case "+ str.trim().equalsIgnoreCase(str2)); //true

        //5. charAt()
        System.out.println("7. Char at Index 7: "+ str.charAt(7)); //J

        //6. indexOf() and LastIndexOf()
        System.out.println("8. Index of 'Java': "+ str.indexOf("Java"));
        System.out.println("9. Last index of 'o': "+ str.lastIndexOf("o"));

        //7. substring()
        System.out.println("10. Substring (7to 11): "+ str.substring(7,11));

        //8. replace() and replaceAll()
        System.out.println("11. Replace 'Java' with 'Python': "+ str.replace("Java","Python"));
        System.out.println("12. Replace all space with '-': "+ str.replaceAll(" ", "-"));

        //9. contains()
        System.out.println("13. Contains the word 'World': "+ str.contains("World"));

        //10. startsWith() and endsWith()
        System.out.println("14. Strats with ' He': "+ str.startsWith(" He"));
        System.out.println("15. Ends with 'ld ': "+ str.endsWith("ld "));

        //11. isEmpty() and isBlank()
        String emptyStr ="";
        String blankStr ="  ";
        System.out.println("16. isEmpty(): "+emptyStr.isEmpty());
        System.out.println("17. isBlank(): "+blankStr.isBlank());

        //12. split()
        String[] words = str.trim().split(" ");
        System.out.println("18. Split Words");
        for (String word: words){
            System.out.println(" - "+ word);
        }

        //13. toCharArray()
        System.out.println("19. toCharArray: ");
        char[] chars = str.trim().toCharArray();
        for (char c : chars){
            System.out.print(c + " " );
        }
        System.out.println();

        //14. format()
        String name = "Varun";
        int age = 30;
        System.out.println("20. Format: "+ String.format("Name: %s, Age: %d", name,age));

        //15. join()
        String joined = String.join("-", "Java","Python","C++");
        System.out.println("21. Join: "+ joined);

        //16. Reversing a string
        String original = "Java";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println("22. Reversed string is: "+ reversed); // Output: avaJ


        // Input from user-----------------------------------------------------------------------------------------
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter another string for comparison: ");
        String compare = scanner.nextLine();

        System.out.println("\n=== String Methods Output ===");

        // 1. Length
        System.out.println("1. Length: " + input.length());

        // 2. Trim
        System.out.println("2. Trimmed: '" + input.trim() + "'");

        // 3. Case conversion
        System.out.println("3. Uppercase: " + input.toUpperCase());
        System.out.println("4. Lowercase: " + input.toLowerCase());

        // 4. Equality
        System.out.println("5. Equals: " + input.equals(compare));
        System.out.println("6. Equals Ignore Case: " + input.equalsIgnoreCase(compare));

        // 5. Character access
        if (input.length() > 0) {
            System.out.print("7. Enter index to get character: ");
            int index = scanner.nextInt();
            if (index >= 0 && index < input.length()) {
                System.out.println("Character at " + index + ": " + input.charAt(index));
            } else {
                System.out.println("Invalid index.");
            }
            scanner.nextLine(); // consume newline
        }

        // 6. Substring
        System.out.print("8. Enter start index for substring: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index for substring: ");
        int end = scanner.nextInt();
        if (start >= 0 && end <= input.length() && start < end) {
            System.out.println("Substring: " + input.substring(start, end));
        } else {
            System.out.println("Invalid indices for substring.");
        }
        scanner.nextLine(); // consume newline

        // 7. Replace
        System.out.print("9. Enter text to replace: ");
        String oldText = scanner.nextLine();
        System.out.print("Enter replacement text: ");
        String newText = scanner.nextLine();
        System.out.println("Replaced string: " + input.replace(oldText, newText));

        // 8. Contains
        System.out.print("10. Enter text to search: ");
        String search = scanner.nextLine();
        System.out.println("Contains '" + search + "': " + input.contains(search));

        // 9. Split
        System.out.print("11. Enter delimiter to split string: ");
        String delimiter = scanner.nextLine();
        String[] parts = input.split(delimiter);
        System.out.println("Split parts:");
        for (String part : parts) {
            System.out.println("- " + part);
        }

        // 10. toCharArray
        System.out.println("12. Characters:");
        for (char c : input.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 13. Format
        System.out.print("13. Enter your name: ");
        String Name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int Age = scanner.nextInt();
        System.out.println(String.format("Formatted: Name = %s, Age = %d", Name, Age));

        //14. Get string input for reversing------------------------------------------------------------
        System.out.print("Enter a string to reverse: ");
        String org = scanner.nextLine();

        // Reverse a string using StringBuilder
        String reversed1 = new StringBuilder(org).reverse().toString();
        System.out.println("Reversed (StringBuilder): " + reversed1);

        scanner.close();


    }
}
