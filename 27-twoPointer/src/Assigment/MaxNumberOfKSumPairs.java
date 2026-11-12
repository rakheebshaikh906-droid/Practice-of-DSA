package Assigment;

import java.util.Arrays;
// https://leetcode.com/problems/max-number-of-k-sum-pairs/
// 1679. Max Number of K-Sum Pairs

public class MaxNumberOfKSumPairs {
    static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        System.out.println(maxOperations(nums, k));
    }
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;
        int count = 0;

        while (i < j) {
            if (nums[i] + nums[j] == k) {
                count++;
                i++;
                j--;
            } else if (nums[i] + nums[j] < k) {
                i++;
            } else {
                j--;
            }
        }

        return count;
    }
}
