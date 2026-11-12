
package Assigment;

// https://leetcode.com/problems/find-the-duplicate-number/
// 287. Find the Duplicate Number

public class FindTheDuplicateNumber {

    static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};

        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            if (nums[i] != i + 1) {

                // Perform simple cyclic sort
                int correct = nums[i] - 1;

                if (nums[i] != nums[correct]) {

                    // Swap them
                    swap(nums, i, correct);

                } else {
                    return nums[i];
                }

            } else {
                i++;
            }
        }

        return -1;
    }

    // Write a method to swap the indexes
    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
