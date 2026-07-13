package ObjectClasses;

public class getClass {
    static void main(String[] args) {
        milk m = new cake();

        System.out.println(m.getClass());
    }
}

class milk{
    //body
}

class cake extends milk{
    //body
}
