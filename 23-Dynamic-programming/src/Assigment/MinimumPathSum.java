package Assigment;

//https://leetcode.com/problems/minimum-path-sum/description/
//64. Minimum Path Sum

import java.util.Arrays;

public class MinimumPathSum {
    static void main(String[] args) {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        System.out.println("Recursion + Memoization: " + minPathSumMemoization(grid));
        System.out.println("Tabulation: " + minPathSumTabulation(grid));
        System.out.println("Space Optimized: " + minPathSumSpaceOptimized(grid));
    }

    // ==================== RECURSION + MEMOIZATION ====================

    public static int minPathSumMemoization(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(m - 1, n - 1, dp, grid);
    }

    public static int solve(int i, int j, int[][] dp, int[][] grid) {

        if (i == 0 && j == 0) {
            return grid[i][j];
        }

        if (i < 0 || j < 0) {
            return Integer.MAX_VALUE;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int up = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;

        if (i > 0) {
            up = grid[i][j] + solve(i - 1, j, dp, grid);
        }

        if (j > 0) {
            left = grid[i][j] + solve(i, j - 1, dp, grid);
        }

        dp[i][j] = Math.min(up, left);

        return dp[i][j];
    }


    // ==================== TABULATION ====================

    public static int minPathSumTabulation(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        dp[0][0] = grid[0][0];

        // First row
        for (int j = 1; j < n; j++) {
            dp[0][j] = grid[0][j] + dp[0][j - 1];
        }

        // First column
        for (int i = 1; i < m; i++) {
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }

        // Remaining cells
        for (int i = 1; i < m; i++) {

            for (int j = 1; j < n; j++) {

                int up = dp[i - 1][j];
                int left = dp[i][j - 1];

                dp[i][j] = grid[i][j] + Math.min(up, left);
            }
        }

        return dp[m - 1][n - 1];
    }


    // ==================== SPACE OPTIMIZATION ====================

    public static int minPathSumSpaceOptimized(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[] prev = new int[n];

        for (int i = 0; i < m; i++) {

            int[] curr = new int[n];

            for (int j = 0; j < n; j++) {

                if (i == 0 && j == 0) {
                    curr[j] = grid[i][j];
                } else {

                    int up = Integer.MAX_VALUE;
                    int left = Integer.MAX_VALUE;

                    if (i > 0) {
                        up = prev[j];
                    }

                    if (j > 0) {
                        left = curr[j - 1];
                    }

                    curr[j] = grid[i][j] + Math.min(up, left);
                }
            }

            prev = curr;
        }

        return prev[n - 1];
    }
}