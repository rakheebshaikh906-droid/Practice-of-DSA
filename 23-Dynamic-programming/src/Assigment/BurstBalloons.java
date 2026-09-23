package Assigment;

//https://leetcode.com/problems/burst-balloons/
//312. Burst Balloons

public class BurstBalloons {
    static void main(String[] args) {
        int[]nums={3,1,5,8};
        System.out.println(maxCoins(nums));
    }
    public static int maxCoins(int[] nums) {
        int n = nums.length;
        int[] a = new int[n + 2];
        a[0] = 1;
        a[n + 1] = 1;

        for (int i = 0; i < n; i++) {
            a[i + 1] = nums[i];
        }
        int[][] dp = new int[n + 2][n + 2];
        return f(1, n, a, dp);
    }
    private static int f(int i, int j, int[] a, int[][] dp) {
        // Base case
        if (i > j) {
            return 0;
        }
        // Already calculated
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        int max = Integer.MIN_VALUE;
        for (int k = i; k <= j; k++) {
            int coins = a[i - 1] * a[k] * a[j + 1] + f(i, k - 1, a, dp) + f(k + 1, j, a, dp);
            max = Math.max(max, coins);
        }
        dp[i][j] = max;
        return dp[i][j];
    }
}
