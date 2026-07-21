package Properties.inheritance;


//Main class
public class MultiLevelInheritance {
    static void main(String[] args) {
        Children obj = new Children();

        obj.gpProperty(); // from GrandParent
        obj.pProperty();  // from Parent
        obj.cProperty();  // from Child
    }
}

// Parent class
class GrandParent {
    void gpProperty() {
        System.out.println("GrandParent property");
    }
}

// Child class of GrandParent
class Parents extends GrandParent {
    void pProperty() {
        System.out.println("Parent property");
    }
}

// Child class of Parent
class Children extends Parents {
    void cProperty() {
        System.out.println("Child property");
    }
}

