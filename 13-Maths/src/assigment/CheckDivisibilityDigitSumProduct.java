package Assigment;

//https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/description/?envType=problem-list-v2&envId=math
//3622. Check Divisibility by Digit Sum and Product

public class CheckDivisibilityDigitSumProduct {
    static void main(String[] args) {
        int n=99;
        System.out.println(check(n));
    }
    static boolean check(int n){
        int original = n;
        int sum=0;
        int prod=1;
        while(n!=0){
            int digit=n%10;
            sum+=digit;
            prod*=digit;
            n/=10;
        }
        int ans=sum+prod;

        return original%ans==0;
    }
}
