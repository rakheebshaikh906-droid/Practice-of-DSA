package Assigment;

import java.util.Arrays;

public class SingleNumberIII {
    static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};
        System.out.println(Arrays.toString(single(nums)));
    }

    static int[] single(int[] nums) {
        int[] ans = new int[2];
        int index = 0;
        int[] freq = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        for (int j = 0; j < freq.length; j++) {
            if (freq[j] == 1) {
                ans[index] = j;
                index++;
            }
        }
        return ans;
    }
}
