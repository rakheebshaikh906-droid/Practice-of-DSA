package Code.rakheeb;

public class Comparison {
    static void main(String[] args) {
        // Two string variables with the same literal value
        String a="shaikh abdul rakheeb";
        String b="shaikh abdul rakheeb";
        // (==) checks whether both references point to the same object in memory
        // In this case, 'a' and 'b' point to the same string object
        // because Java stores string literals in the String Pool for memory efficiency.
        System.out.println(a==b);//true

        // Note: If you used 'new String()', a new object would be created.
        // Example:
        // String c = new String("shaikh abdul rakheeb");
        // System.out.println(a == c); // false (different objects)
    }
}
