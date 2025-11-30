package code.rakheeb;

public class ParameterString {
    public static void main(String[] args) {
        String personalised = myGreet("Asim");
        System.out.println(personalised);
    }

    private static String myGreet(String name) {
        String message = "hello "+name;
        return message;
    }


}
