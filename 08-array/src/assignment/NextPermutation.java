package assignment;

import java.util.Arrays;

//https://leetcode.com/problems/next-permutation/description/?envType=problem-list-v2&envId=two-pointers
//31. Next Permutation
public class NextPermutation {
    static void main(String[] args) {
        int[]nums={1,2,3};
        nextPermutation(nums);

        for(int num:nums){
            System.out.print(num+" ");
        }
    }
    static void nextPermutation(int[]nums){
        int n = nums.length;

        // 1. Find pivot (first index from right where nums[i] < nums[i+1])
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // 2. If pivot found, find just larger element on right and swap
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        // 3. Reverse the right part
        reverse(nums, i + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
