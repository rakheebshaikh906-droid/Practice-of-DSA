package code;

import java.util.Arrays;

public class CountPartitionWithGivenDiff {
    static void main(String[] args) {
        int[]nums={5,2,6,2};
        int d=3;
        System.out.println(countPartitions(nums,d));
    }
    static int countPartitions(int[] nums, int d) {
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }
        // Impossible cases
        if (totalSum < d || (totalSum + d) % 2 != 0) {
            return 0;
        }
        int target = (totalSum + d) / 2;
        int n = nums.length;
        int[][] dp = new int[n][target + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(n - 1, target, nums, dp);
    }
    static int solve(int i, int target, int[] nums, int[][] dp) {
        if (i == 0) {
            if (target == 0 && nums[0] == 0) {
                return 2;
            }

            if (target == 0 || target == nums[0]) {
                return 1;
            }
            return 0;
        }
        if (dp[i][target] != -1) {
            return dp[i][target];
        }
        // Don't take
        int notTake = solve(i - 1, target, nums, dp);
        // Take
        int take = 0;
        if (nums[i] <= target) {
            take = solve(i - 1, target - nums[i], nums, dp);
        }
        return dp[i][target] = take + notTake;
    }
}
