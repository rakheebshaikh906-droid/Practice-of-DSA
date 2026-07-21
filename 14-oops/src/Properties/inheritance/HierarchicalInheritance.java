package Properties.inheritance;

//Main class
public class HierarchicalInheritance {
    static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.property();
        c1.education();

        Child2 c2 = new Child2();
        c2.property();
        c2.job();
    }
}

// Parent class
class Parentss {
    void property() {
        System.out.println("Parents have property");
    }
}

// First child class
class Child1 extends Parentss {
    void education() {
        System.out.println("Child1 is studying");
    }
}

// Second child class
class Child2 extends Parentss {
    void job() {
        System.out.println("Child2 is doing a job");
    }
}
