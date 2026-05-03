package code;

public class Nto1 {
    static void main(String[] args){
        fun(10);
    }
    static void fun(int n){
        //base case
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);//recursive call
    }
}
