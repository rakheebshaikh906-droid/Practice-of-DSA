package Assigment;

//https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/
//3105. Longest Strictly Increasing or Strictly Decreasing Subarray

public class LongestMonotonicSubarray {
    static void main(String[] args) {
        int[] nums = {1, 4, 3, 3, 2};
        System.out.println(longestMonotonicSubarray(nums));
    }
    public static int longestMonotonicSubarray(int[] nums) {
        int inc = 1;
        int dec = 1;
        int ans = 1;

        int l = 0;
        int r = 1;

        while (r < nums.length) {

            if (nums[l] < nums[r]) {
                inc++;
                dec = 1;
            } else if (nums[l] > nums[r]) {
                dec++;
                inc = 1;
            } else {
                inc = 1;
                dec = 1;
            }

            ans = Math.max(ans, Math.max(inc, dec));

            l++;
            r++;
        }

        return ans;
    }
}
