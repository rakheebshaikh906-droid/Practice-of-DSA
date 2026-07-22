package Properties.inheritance;

//Main class
public class singleLevelInheritance {
    static void main(String[] args) {
        Child obj = new Child();

        obj.show();     // inherited method
        obj.display();  // child method
    }
}

// Parent class
class Parent {
    void show() {
        System.out.println("This is Parent class");
    }
}

// Child class
class Child extends Parent {
    void display() {
        System.out.println("This is Child class");
    }
}
