package Properties.abstraction;

public class Abstarction {
    static void main(String[] args) {
        Shape s = new Circle(); // abstraction
        s.draw();
        s.info();
    }
}

// Abstract class
abstract class Shape {

    // abstract method
    abstract void draw();

    // normal method
    void info() {
        System.out.println("This is a shape");
    }
}

// Child class
class Circle extends Shape {

    // implementing abstract method
    void draw() {
        System.out.println("Drawing Circle");
    }
}

