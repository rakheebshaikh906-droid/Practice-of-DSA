
package Assigment;

// https://leetcode.com/problems/sort-array-by-parity/
// 905. Sort Array By Parity

public class SortArrayByParity {

    static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};

        int[] ans = sortArrayByParity(nums);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] % 2 == 0) {
                left++;
            } else if (nums[right] % 2 != 0) {
                right--;
            } else {
                swap(nums, left, right);
            }
        }

        return nums;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
