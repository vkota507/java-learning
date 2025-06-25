import java.util.Scanner;

public class Day5_1_String_tasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1. Reverse a String
        System.out.print("Enter a string: ");
        String org = input.nextLine();

        String to_reverse = new StringBuilder(org).reverse().toString();
        System.out.println("Reversed (StringBuilder): "+ to_reverse);

        //2. Count vowels and consonants

        System.out.print("enter a string: ");
        String str = input.nextLine();
        str = str.toLowerCase();

        int vowels = 0, consonants =0;

        for (int i =0; i<str.length();i++){
            char ch = str.charAt(i);

            if (Character.isLetter(ch)){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        //3. Palindrome

        System.out.print("Enter a string: ");
        String pal = input.nextLine();

        String reversed = new StringBuilder(pal).reverse().toString();

        if (pal.equals(reversed)){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

    }
}
