package Assigment;

//https://leetcode.com/problems/minimum-number-of-removals-to-make-mountain-array/description/
//1671. Minimum Number of Removals to Make Mountain Array

import java.util.Arrays;

public class MinimumNumberOfRemovalsToMakeMountainArray {
    static void main(String[] args) {
        int []nums={2,1,1,5,6,2,3,1};
        System.out.println(minimumMountainRemovals(nums));

    }
    public static int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] dp1 = new int[n];
        Arrays.fill(dp1, 1);

        // LIS from left
        for (int i = 0; i < n; i++) {
            for (int prev = 0; prev < i; prev++) {
                if (nums[i] > nums[prev]) {
                    dp1[i] = Math.max(dp1[i], dp1[prev] + 1);
                }
            }
        }

        int[] dp2 = new int[n];
        Arrays.fill(dp2, 1);

        // LDS from right
        for (int i = n - 1; i >= 0; i--) {
            for (int next = n - 1; next > i; next--) {
                if (nums[i] > nums[next]) {
                    dp2[i] = Math.max(dp2[i], dp2[next] + 1);
                }
            }
        }

        int maxMountain = 0;
        // Every index can be a peak
        for (int i = 1; i < n - 1; i++) {
            if (dp1[i] > 1 && dp2[i] > 1) {
                int mountain = dp1[i] + dp2[i] - 1;
                maxMountain = Math.max(maxMountain, mountain);
            }
        }

        return n - maxMountain;

    }
}
