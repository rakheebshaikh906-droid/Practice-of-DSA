package Assigment;

//https://leetcode.com/problems/minimum-size-subarray-sum/
//209. Minimum Size Subarray Sum

public class MinimumSizeSubarraySum {
    static void main(String[] args) {
        int[]nums={2,3,1,2,4,3};
        int target=7;

        System.out.println(minSubArrayLen(target,nums));

    }
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int r = 0;
        int l = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        while (l < n && r < n) {

            sum += nums[r];
            r++;

            while (sum >= target) {
                min = Math.min(min, r - l);
                sum -= nums[l];
                l++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
