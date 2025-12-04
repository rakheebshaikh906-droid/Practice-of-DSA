package code.rakheeb;

public class Shadowing {
    static int a = 20; // this will be shadow at line 8
    public static void main(String[] args) {
        System.out.println(a);//20
        int a = 99;
        System.out.println(a);//99
        fun();
    }

    static void fun(){
        System.out.println(a);
    }
}
