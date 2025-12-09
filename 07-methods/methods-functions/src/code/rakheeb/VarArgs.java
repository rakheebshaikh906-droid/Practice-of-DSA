package code.rakheeb;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // when you dont know how many
        // variables are going to pass use this
        fun(20,35,65,29,18);
        multiple(27,94,"Asim","Shuja");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a , int b, String ...v){
        System.out.println(Arrays.toString(v));
    }
}
