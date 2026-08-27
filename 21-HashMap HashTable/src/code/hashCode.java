package code;

//hashCode() is a method of the Object class in Java that returns an integer value representing the hash value of an object.
//output will be an integer like

public class hashCode {
    static void main(String[] args) {
        String name = "karan";
        String name1 = "karan";
        int code = name.hashCode();
        int code2 = name1.hashCode();
        System.out.println(code);
        System.out.println(code2);

    }
}
