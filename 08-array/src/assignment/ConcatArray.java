package assignment;

import java.util.Arrays;

public class ConcatArray {
    static void main(String[] args) {
        int[] nums = {1, 2, 3};

        int[] ans = new int[2 * nums.length]; // new array with double size

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];      // copy original array
            ans[i + nums.length] = nums[i];  // copy again for second half
        }
        System.out.println("Concatenated Array: " + Arrays.toString(ans));
    }
}





