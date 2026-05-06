package code;

//print number using recursion from 1 to 100
public class RecursionEx {
    static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if(n==100){// base case
            System.out.println(100);
            return;
        }
        System.out.println(n);
        print(n+1);  //function call itself  //it also called as recursive call
    }
}
