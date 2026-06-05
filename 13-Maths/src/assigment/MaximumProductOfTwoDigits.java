package Assigment;

//https://leetcode.com/problems/maximum-product-of-two-digits/description/?envType=problem-list-v2&envId=math
//3536. Maximum Product of Two Digits

public class MaximumProductOfTwoDigits {
    static void main(String[] args) {
        int n=31;
        System.out.println(maxProduct(n));
    }
    static int maxProduct(int n){
        int max1 = 0, max2 = 0;
        while(n > 0) {
            int digit = n % 10;
            if (digit >= max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }
            n /= 10;
        }
        return max1 * max2;
    }
}
