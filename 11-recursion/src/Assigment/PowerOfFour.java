package Assigment;

//https://leetcode.com/problems/power-of-four/
//342. Power of Four
public class PowerOfFour {
    static void main(String[] args) {
        int n=16;
        System.out.println(isPowerOfFour(n));
    }
    static boolean isPowerOfFour(int n) {
        //base case
        if(n==1){
            return true;
        }
        if(n<=0 || n%4!=0){
            return false;
        }
        return isPowerOfFour(n/4);//recursive call
    }
}
