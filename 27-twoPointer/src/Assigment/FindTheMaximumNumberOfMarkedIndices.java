
package Assigment;

import java.util.Arrays;

// https://leetcode.com/problems/find-the-maximum-number-of-marked-indices/
// 2576. Find the Maximum Number of Marked Indices

public class FindTheMaximumNumberOfMarkedIndices {
    static void main(String[] args) {
        int[] nums = {3, 5, 2, 4};
        System.out.println(maxNumOfMarkedIndices(nums));
    }
    public static int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int i = 0;
        int j = n / 2;
        int count = 0;

        while (i < n / 2 && j < n) {
            if (2 * nums[i] <= nums[j]) {
                count += 2;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return count;
    }
}
