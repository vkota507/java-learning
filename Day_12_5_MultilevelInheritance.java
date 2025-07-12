import java.util.Scanner;

public class Day_12_5_MultilevelInheritance {

    // Level 1: Grandparent class
    static class Grandparent{
        String familyName;

        public void showFamilyName() {
            System.out.println("Family Name: " + familyName);
        }
    }

    // Level 2: Parent class extending Grandparent
    static class Parent extends Grandparent{
        String parentName;

        public void showParentDetails() {
            showFamilyName(); // calls Grandparent method
            System.out.println("Parent Name: " + parentName);
        }
    }

    // Level 3: Child class extending Parent
    static class Child extends Parent{
        String childName;

        public void showChildDetails() {
            showParentDetails(); // calls Parent method
            System.out.println("Child Name: " + childName);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creating child object
        Child child = new Child();

        // Taking input from user
        System.out.print("Enter family name: ");
        child.familyName = input.nextLine();

        System.out.print("Enter parent name: ");
        child.parentName = input.nextLine();

        System.out.print("Enter child name: ");
        child.childName = input.nextLine();

        // Display child details
        System.out.println("\n---- Family Details ----");
        child.showChildDetails();

        input.close(); // closing scanner
    }
}
