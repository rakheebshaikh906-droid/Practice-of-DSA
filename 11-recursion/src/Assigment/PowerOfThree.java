package Assigment;

//https://leetcode.com/problems/power-of-three/description/
//326. Power of Three
public class PowerOfThree {
    static void main(String[] args) {
        int n=27;
        System.out.println(isPowerOfThree(n));
    }
    static boolean isPowerOfThree(int n){
        //base case
        if(n==1){
            return true;
        }
        if(n<=0 || n%3!=0){
            return false;
        }
        return isPowerOfThree(n/3); //recursive call
    }
}
