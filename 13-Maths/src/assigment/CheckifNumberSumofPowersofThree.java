package Assigment;

//https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/description/?envType=problem-list-v2&envId=math
//1780. Check if Number is a Sum of Powers of Three

public class CheckifNumberSumofPowersofThree {
    static void main(String[] args) {
        int n=91;
        System.out.println(powerThree(n));
    }
    static boolean powerThree(int n){
        while(n>0){
            if(n%3==2){
                return false;
            }
            n/=3;
        }
        return true;
    }
}
