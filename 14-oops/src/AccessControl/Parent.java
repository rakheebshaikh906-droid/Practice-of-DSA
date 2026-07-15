package AccessControl;

public class Parent {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;        // default access
    private int privateVar = 40;

    public void show() {
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar);
    }
}
