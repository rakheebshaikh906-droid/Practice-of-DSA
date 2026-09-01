package Assigment;

//https://leetcode.com/problems/house-robber-ii/description/
//213. House Robber II

import java.util.Arrays;
public class HouseRobberII {
    static void main(String[] args) {

        int[] nums = {2, 3, 2};

        System.out.println("Recursion        : " +robRecursion(nums));
        System.out.println("Memoization      : " +robMemo(nums));
        System.out.println("Tabulation       : " +robTabulation(nums));
        System.out.println("Space Optimized  : " +robSpace(nums));
    }

    // RECURSION
    static int robRecursion(int[] nums) {

        int n = nums.length;

        if (n == 1)
            return nums[0];

        return Math.max(
                solveRec(0, n - 2, nums),
                solveRec(1, n - 1, nums)
        );
    }
    static int solveRec(int idx, int end, int[] nums) {

        if (idx > end) return 0;

        int pick = nums[idx] + solveRec(idx + 2, end, nums);
        int notPick = solveRec(idx + 1, end, nums);

        return Math.max(pick, notPick);
    }

    // MEMOIZATION
    static int robMemo(int[] nums) {

        int n = nums.length;

        if (n == 1) return nums[0];

        int[] dp1 = new int[n];
        int[] dp2 = new int[n];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int first = solveMemo(0, n - 2, nums, dp1);
        int second = solveMemo(1, n - 1, nums, dp2);

        return Math.max(first, second);
    }

    private static int solveMemo(int idx, int end, int[] nums, int[] dp) {

        if (idx > end)
            return 0;

        if (dp[idx] != -1)
            return dp[idx];

        int pick = nums[idx] + solveMemo(idx + 2, end, nums, dp);
        int notPick = solveMemo(idx + 1, end, nums, dp);

        return dp[idx] = Math.max(pick, notPick);
    }

    // TABULATION
    static int robTabulation(int[] nums) {

        int n = nums.length;

        if (n == 1)
            return nums[0];

        int first = tabulation(0, n - 2, nums);
        int second = tabulation(1, n - 1, nums);

        return Math.max(first, second);
    }
    public static int tabulation(int start, int end, int[] nums) {

        int len = end - start + 1;

        int[] dp = new int[len];

        dp[0] = nums[start];

        for (int i = 1; i < len; i++) {

            int pick = nums[start + i];

            if (i > 1)
                pick += dp[i - 2];

            int notPick = dp[i - 1];

            dp[i] = Math.max(pick, notPick);
        }

        return dp[len - 1];
    }


    // SPACE OPTIMIZATION
    static int robSpace(int[] nums) {

        int n = nums.length;

        if (n == 1) return nums[0];

        int first = space(0, n - 2, nums);
        int second = space(1, n - 1, nums);

        return Math.max(first, second);
    }

    public static int space(int start, int end, int[] nums) {

        int prev2 = 0;
        int prev1 = 0;

        for (int i = start; i <= end; i++) {

            int pick = nums[i] + prev2;

            int notPick = prev1;

            int curr = Math.max(pick, notPick);

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}