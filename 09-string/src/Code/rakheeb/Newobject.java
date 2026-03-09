package Code.rakheeb;
//crate a new object
public class Newobject {
    static void main(String[] args) {
        // Create a String object and assign it a value
        String a="Shaikh Abdul Rakheeb";
        //print the current value of a
        System.out.println(a);
        // Now we assign a new value to 'a'
        // Remember: String objects are immutable, so this doesn't change
        // the old object — it creates a new one and makes 'a' refer to it
        // we don't change the object we create new obj
        a="Syed Asimuddin";
        //print the new value of a
        System.out.println(a);
    }
}
