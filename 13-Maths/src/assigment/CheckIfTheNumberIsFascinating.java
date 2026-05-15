package Assigment;

//https://leetcode.com/problems/check-if-the-number-is-fascinating/description/
//2729. Check if The Number is Fascinating

public class CheckIfTheNumberIsFascinating {
    static void main(String[] args) {
        int n=192;
        System.out.println(fascinating(n));
    }
    static boolean fascinating(int n){
        int m=2*n;
        int p=3*n;

        String s=""+n+m+p;

        if (s.length() != 9) return false;

        int[] freq = new int[10];

        for (char ch : s.toCharArray()) {
            int digit = ch - '0';

            if (digit == 0) return false;

            freq[digit]++;
        }

        // check each digit 1–9 exactly once
        for (int i = 1; i <= 9; i++) {
            if (freq[i] != 1) return false;
        }

        return true;
    }
}
