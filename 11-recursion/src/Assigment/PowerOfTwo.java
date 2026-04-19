package Assigment;

//https://leetcode.com/problems/power-of-two/description/
//231. Power of Two
public class PowerOfTwo {
    static void main(String[] args) {
        int n=16;
        System.out.println(isPowerOfTwo(n));
    }
    static boolean isPowerOfTwo(int n){
        //base case
        if(n==1){
            return true;
        }
        if(n<=0 || n%2!=0){
            return false;
        }
        return isPowerOfTwo(n/2); //recursive call
    }
}
