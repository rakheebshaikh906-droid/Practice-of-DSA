
package Assigment;

import java.util.Arrays;

// https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/
// 1877. Minimize Maximum Pair Sum in Array

public class MinimizeMaximumPairSumInArray {
    static void main(String[] args) {
        int[] nums = {3, 5, 2, 3};

        System.out.println(minPairSum(nums));
    }
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        int max = Integer.MIN_VALUE;

        while (left < right) {
            int sum = nums[left] + nums[right];

            left++;
            right--;

            max = Math.max(max, sum);
        }

        return max;
    }
}
