package Assigment;

//https://leetcode.com/problems/fibonacci-number/description/
//509. Fibonacci Number
public class fibonacciNumber {
    static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
    static int fibonacci(int n){
        if(n==0)return 0;
        if(n==1)return 1;

        return fibonacci(n-1)+fibonacci(n-2);
    }
}
