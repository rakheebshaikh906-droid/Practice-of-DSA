package ObjectCloning;

public class ShallowCopy {
    public static void main(String[] args) {

        // Creating Address object
        Address a1 = new Address("Aurangabad");

        // Creating Student1 object with Address reference
        Student1 s1 = new Student1(1, a1);

        try {
            // Creating shallow copy of s1
            Student1 s2 = (Student1) s1.clone();

            // Modifying address using cloned object
            s2.address.city = "Pune";

            // Both objects reflect the change
            // because address reference is shared (shallow copy)
            System.out.println(s1.address.city); // Pune
            System.out.println(s2.address.city); // Pune

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}

// Address class (non-primitive field)
class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

// Student class implementing Cloneable
class Student1 implements Cloneable {

    int id;
    Address address;

    Student1(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    // Overriding clone() method
    // This creates a SHALLOW COPY
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // copies references, not objects
    }
}
