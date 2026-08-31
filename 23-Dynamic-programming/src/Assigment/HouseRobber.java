package Assigment;

//https://leetcode.com/problems/house-robber/description/
//198. House Robber

import java.util.Arrays;

public class HouseRobber {
    static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};

        System.out.println(rob(nums)); // 12
    }

    //using memorization
    static int rob(int[] nums) {
        int n = nums.length;

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return f(n - 1, nums, dp);
    }
    static int f(int idx, int[] nums, int[] dp) {

        if (idx == 0) return nums[0];

        if (idx < 0) return 0;

        if (dp[idx] != -1) return dp[idx];

        int pick = nums[idx] + f(idx - 2, nums, dp);
        int notPick = f(idx - 1, nums, dp);

        return dp[idx] = Math.max(pick, notPick);
    }

    //using tabulation
    public int maximumNonAdjacentSum(int[] arr) {
        int n = arr.length;

        if (n == 1) return arr[0];

        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < n; i++) {
            int take = arr[i] + dp[i - 2];
            int notTake = dp[i - 1];
            dp[i] = Math.max(take, notTake);
        }
        return dp[n - 1];
    }

    //using space optimization
    public int maximumNonAdjacentSumSpace(int[] arr) {
        int n = arr.length;

        if (n == 1) return arr[0];

        int prev2 = arr[0];
        int prev1 = Math.max(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {
            int take = arr[i] + prev2;
            int notTake = prev1;
            int curr = Math.max(take, notTake);

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
