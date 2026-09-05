package Assigment;

//https://leetcode.com/problems/distinct-subsequences/description/
//115. Distinct Subsequences

import java.util.Arrays;
public class NumDistinct {
    static void main(String[] args) {
        String s = "babgbag";
        String t = "bag";

        System.out.println("Recursion: " + recursion(s, t));
        System.out.println("Memoization: " + memoization(s, t));
        System.out.println("Tabulation: " + tabulation(s, t));
        System.out.println("Space Optimized: " + spaceOptimized(s, t));
    }

    // 1. Recursion
    public static int recursion(String s, String t) {
        return solveRecursion(s.length() - 1, t.length() - 1, s, t);
    }
    public static int solveRecursion(int i, int j, String s, String t) {
        if (j < 0) {
            return 1;
        }
        if (i < 0) {
            return 0;
        }
        if (s.charAt(i) == t.charAt(j)) {
            return solveRecursion(i - 1, j - 1, s, t) + solveRecursion(i - 1, j, s, t);
        } else {
            return solveRecursion(i - 1, j, s, t);
        }
    }
    // 2. Memoization
    public static int memoization(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solveMemo(n - 1, m - 1, s, t, dp);
    }
    public static int solveMemo(int i, int j, String s, String t, int[][] dp) {
        if (j < 0) {
            return 1;
        }
        if (i < 0) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (s.charAt(i) == t.charAt(j)) {

            dp[i][j] = solveMemo(i - 1, j - 1, s, t, dp) + solveMemo(i - 1, j, s, t, dp);

        } else {
            dp[i][j] = solveMemo(i - 1, j, s, t, dp);
        }
        return dp[i][j];
    }

    // 3. Tabulation
    public static int tabulation(String s, String t) {

        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n + 1][m + 1];

        // Base case
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int j = 1; j <= m; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][m];
    }

    // 4. Space Optimized - 2 Arrays
    public static int spaceOptimized(String s, String t) {

        int n = s.length();
        int m = t.length();

        long[] curr = new long[m + 1];
        long[] prev = new long[m + 1];

        curr[0] = 1;
        prev[0] = 1;

        for (int i = 1; i <= n; i++) {
            curr[0] = 1;
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    curr[j] = prev[j - 1] + prev[j];
                } else {
                    curr[j] = prev[j];
                }
            }
            prev = curr.clone();
        }
        return (int) prev[m];
    }
}