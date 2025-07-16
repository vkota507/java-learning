interface Day14_Shape {
    void draw(); // method without body
}

class Day14_Circle implements Day14_Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Day14_Interface_Intro {
    public static void main(String[] args) {
        Day14_Circle c = new Day14_Circle();
        c.draw();
    }
}
