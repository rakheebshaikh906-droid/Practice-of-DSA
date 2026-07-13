package ObjectCloning;

public class DeepCopy {
    public static void main(String[] args) {

        // Create Address object
        Address1 addr1 = new Address1("Aurangabad", 431001);

        // Pass Address object (NOT String) to Student2
        Student2 s1 = new Student2(101, "Rakheeb", addr1);

        try {
            // Deep copy
            Student2 s2 = (Student2) s1.clone();

            // Modify cloned object's address
            s2.address.city = "Pune";

            // Original object remains unchanged
            System.out.println(s1.address.city); // Aurangabad
            System.out.println(s2.address.city); // Pune

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}

class Address1 {
    String city;
    int pincode;

    Address1(String city, int pincode) {
        this.city = city;
        this.pincode = pincode;
    }
}

class Student2 implements Cloneable {

    int id;
    String name;
    Address1 address;

    Student2(int id, String name, Address1 address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Deep copy implementation
    public Object clone() throws CloneNotSupportedException {
        Student2 s = (Student2) super.clone();
        s.address = new Address1(this.address.city, this.address.pincode);
        return s;
    }
}
