package Packages.a;


import static Packages.b.Main.message;

public class greeting {
    public static void main(String[] args) {
        System.out.println("Hello world");
        message();//this will be access because they are in same package name package.
    }
}
