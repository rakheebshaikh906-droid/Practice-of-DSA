package Assigment;

//https://leetcode.com/problems/climbing-stairs/description/
//70. Climbing Stairs

import java.util.Arrays;
public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(climbStairsTopDown(n));
        System.out.println(climbStairsBottomUp(n));
    }

    //Memoization
    public static int climbStairsTopDown(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }
    private static int solve(int n, int[] dp) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = solve(n - 1, dp) + solve(n - 2, dp);

        return dp[n];
    }

    //Bottom Up (Tabulation)
    public static int climbStairsBottomUp(int n) {

        if (n == 1){
            return 1;
        }

        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}