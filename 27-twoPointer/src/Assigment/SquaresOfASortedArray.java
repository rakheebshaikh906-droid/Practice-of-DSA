
package Assigment;

import java.util.Arrays;

// https://leetcode.com/problems/squares-of-a-sorted-array/
// 977. Squares of a Sorted Array

public class SquaresOfASortedArray {
    static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};

        int[] ans = sortedSquares(nums);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int index = 0;

        while (left <= right) {
            if (left == right) {
                ans[index++] = nums[left] * nums[right];
            } else {
                ans[index++] = nums[right] * nums[right];
                ans[index++] = nums[left] * nums[left];
            }

            left++;
            right--;
        }

        Arrays.sort(ans);

        return ans;
    }
}
