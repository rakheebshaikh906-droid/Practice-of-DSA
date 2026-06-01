package Assigment;

//https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/description/?envType=problem-list-v2&envId=math
//1317. Convert Integer to the Sum of Two No-Zero Integers

import java.util.Arrays;

public class getNoZeroIntegers {
    static void main(String[] args) {
        int n=11;
        System.out.println(Arrays.toString(getNoZero(n)));
    }
    static int[] getNoZero(int n) {
        for(int i = 1; i < n; i++) {
            int a = i;
            int b = n - i;

            if(!hasZero(a) && !hasZero(b) && a+b==n) {
                return new int[]{a, b};
            }
        }
        return new int[]{-1, -1}; // fallback (never happens)
    }

    static boolean hasZero(int num) {
        while(num > 0) {
            if(num % 10 == 0) return true;
            num /= 10;
        }
        return false;
    }
}
