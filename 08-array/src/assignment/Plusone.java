package assignment;

import java.util.Arrays;
//https://leetcode.com/problems/plus-one/description/
//Leetcode problem(66)
public class Plusone {
    static void main(String[] args) {
        int[]digits={1,2,3};
        plus(digits);
        System.out.println(Arrays.toString(digits));
    }
    //method for plusone
    static int[] plus(int[]digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;  // if it's 9, make it 0 and continue
            } else {
                digits[i]++;    // increase the last non-9 digit
                return digits;  // done, return directly
            }
        }

        // if all digits were 9, create a new array like 999 → 1000
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
