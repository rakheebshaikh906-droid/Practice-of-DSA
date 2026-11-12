
package Assigment;

// https://leetcode.com/problems/count-subarrays-of-length-three-with-a-condition/
// 3392. Count Subarrays of Length Three With a Condition

public class CountSubarraysOfLengthThree {

    static void main(String[] args) {
        int[] nums = {1, 2, 1, 4, 1};
        System.out.println(countSubarrays(nums));
    }

    public static int countSubarrays(int[] nums) {
        int l = 0;
        int r = 2;
        int count = 0;

        while (r < nums.length) {
            int sum = nums[l] + nums[r];
            int center = nums[l + 1];

            if (sum * 2 == center) {
                count++;
            }

            l++;
            r++;
        }

        return count;
    }
}
