interface Day14_Animal {
    void eat();
    void sleep();
}

class Cat implements Day14_Animal {
    public void eat() {
        System.out.println("Cat eats fish");
    }

    public void sleep() {
        System.out.println("Cat sleeps on sofa");
    }
}

public class Day14_Interface_Task {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.sleep();
    }
}
