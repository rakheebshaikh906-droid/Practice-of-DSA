package Assigment;

//https://leetcode.com/problems/smallest-even-multiple/description/
//2413. Smallest Even Multiple
public class SmallestEvenMultiple {
    static void main(String[] args) {
        int n=5;
        System.out.println(smallestEven(n));
    }
    static int smallestEven(int n){
        //first we check if the number is even or odd
        //if its even return the number
        //if its odd return the number*2

        if(n%2==0){
            return n;
        }else{
            return n*2;
        }
    }
}
