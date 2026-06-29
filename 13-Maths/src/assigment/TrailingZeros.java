package Assigment;

//https://leetcode.com/problems/factorial-trailing-zeroes/description/
//172. Factorial Trailing Zeroes
public class TrailingZeros {
    static void main(String[] args) {
        int n=30;
        System.out.println(trailingZeroes(n));
    }
    static int trailingZeroes(int n){
        int count=0;
        while(n>0){
            n=n/5;
            count=count+n;
        }
        return count;
    }
}
