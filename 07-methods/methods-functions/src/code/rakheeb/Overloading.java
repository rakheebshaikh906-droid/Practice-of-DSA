package code.rakheeb;

public class Overloading {
    public static void main(String[] args) {
        fun(57);
        fun("Asim");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }


}
