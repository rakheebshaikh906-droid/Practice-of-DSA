package Assigment;

//https://leetcode.com/problems/check-digitorial-permutation/
//3848. Check Digitorial Permutation

import java.util.Arrays;
public class DigitorialPermutation {
    static void main(String[] args) {
        int n = 145;
        boolean result = isDigitorialPermutation(n);
        System.out.println(result);
    }

    public static boolean isDigitorialPermutation(int n) {
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        char[] a = String.valueOf(n).toCharArray();
        char[] b = String.valueOf(sum).toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
    public static int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }
}
