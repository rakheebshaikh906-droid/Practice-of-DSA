package code;

//print the nth fibonacci number
public class Fibonacci {
    static void main(String[] args) {
        System.out.println(fibo(8));
    }
    static int fibo(int n){
        //base case
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2); //function call itself && body
    }
}

