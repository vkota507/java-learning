// Day13_Polymorphism_Overriding_Task2.java

class Animal {
    public void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Day13_Polymorphism_Overriding_Task2 {
    public static void main(String[] args) {
        Animal a1 = new Animal(); // Animal reference to Animal object
        a1.makeSound();

        Dog d1 = new Dog(); // Dog reference to Dog object
        d1.makeSound();

        Animal a2 = new Dog(); // Animal reference to Dog object (Polymorphism)
        a2.makeSound(); // Calls Dog's overridden method
    }
}

