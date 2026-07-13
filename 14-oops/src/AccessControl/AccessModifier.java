package AccessControl;

public class AccessModifier {
    public static void main(String[] args) {

        Parent obj = new Parent();

        // public
        System.out.println(obj.publicVar);

        // protected (same package)
        System.out.println(obj.protectedVar);

        // default (same package)
        System.out.println(obj.defaultVar);

        // private → NOT accessible
        // System.out.println(obj.privateVar);  // ERROR
    }
}
