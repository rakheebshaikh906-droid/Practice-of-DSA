package ObjectClasses;

public class InstanceOf {
    public static void main(String[] args) {

        rahim a = new rakheeb();

        System.out.println(a instanceof rakheeb);   // true
        System.out.println(a instanceof rahim); // true
    }
}

// Parent class
class rahim{
    // body
}

// Child class
class rakheeb extends rahim {
    // body
}

