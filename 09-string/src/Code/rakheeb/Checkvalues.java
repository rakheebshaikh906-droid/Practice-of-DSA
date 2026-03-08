package Code.rakheeb;

public class Checkvalues {
     static void main(String[] args) {
        // Creating two different String objects using 'new' keyword
        // Even though they have the same text, they are stored in different memory locations
        String name1=new String("shaikh abdul rakheeb");
        String name2=new String("shaikh abdul rakheeb");
        // .equals() method compares the *content* (values) of the two strings
        // Since both strings contain the same sequence of characters, it returns true
        System.out.println(name1.equals(name2));//true
        // If we had used (==) instead, it would compare memory addresses (references)
        // Example:
        // System.out.println(name1 == name2); // false — because they are two separate objects
    }
}
