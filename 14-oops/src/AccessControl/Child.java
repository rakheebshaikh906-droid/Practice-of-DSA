package AccessControl;

public class Child extends Parent{
    void display() {
        System.out.println(publicVar);       // allowed
        System.out.println(protectedVar);    // allowed
        System.out.println(defaultVar);      // allowed (same package)

        // System.out.println(privateVar);   // ERROR
    }
}
