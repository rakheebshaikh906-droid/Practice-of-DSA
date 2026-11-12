
package Assigment;

import java.util.Arrays;

// https://leetcode.com/problems/count-the-number-of-fair-pairs/
// 2563. Count the Number of Fair Pairs

public class CountTheNumberOfFairPairs {

    static void main(String[] args) {
        int[] nums = {0, 1, 7, 4, 4, 5};
        int lower = 3;
        int upper = 6;

        System.out.println(countFairPairs(nums, lower, upper));
    }

    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);

        return countPairs(nums, upper) - countPairs(nums, lower - 1);
    }

    private static long countPairs(int[] nums, int target) {
        long count = 0;

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] + nums[j] <= target) {
                count += j - i;
                i++;
            } else {
                j--;
            }
        }

        return count;
    }
}
