package assignment;

//https://leetcode.com/contest/weekly-contest-506/problems/check-good-integer/description/
//Q1. Check Good Integer

public class CheckGoodInteger {
    static void main(String[] args) {
        int n=19;
        System.out.println(check(n));
    }
    static boolean check(int n){
        int digitSum=0;
        int squareSum=0;
        while(n>0){
            int digit=n%10;
            digitSum+=digit;
            squareSum+=digit*digit;
            n/=10;
        }
        if(squareSum-digitSum>=50){
            return true;
        }
        return false;
    }
}
