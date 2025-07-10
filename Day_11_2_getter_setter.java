public class Day_11_2_getter_setter {

    // 🔒 Step 1: Private properties
    private String name;
    private int age;

    // 🛠️ Step 2: No-arg constructor
    public Day_11_2_getter_setter() {
        this.name = "Unknown";
        this.age = 0;
    }

    // 🛠️ Step 3: Parameterized constructor
    public Day_11_2_getter_setter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ✅ Step 4: Getter for name
    public String getName() {
        return name;
    }

    // ✅ Step 5: Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // ✅ Step 6: Getter for age
    public int getAge() {
        return age;
    }

    // ✅ Step 7: Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // 🖨️ Step 8: Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // 🚀 Step 9: Main method to test
    public static void main(String[] args) {
        // Creating an object using no-arg constructor
        Day_11_2_getter_setter person1 = new Day_11_2_getter_setter();

        // Displaying default details
        person1.displayDetails();

        // Using setters to update values
        person1.setName("Varun");
        person1.setAge(25);

        // Displaying updated details
        person1.displayDetails();

        // Alternatively, creating with parameterized constructor
        Day_11_2_getter_setter person2 = new Day_11_2_getter_setter("Kumar", 30);
        person2.displayDetails();

        // Using getters individually
        System.out.println("Person2 Name via getter: " + person2.getName());
        System.out.println("Person2 Age via getter: " + person2.getAge());
    }
}
