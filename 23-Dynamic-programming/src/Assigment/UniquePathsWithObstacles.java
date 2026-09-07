package Assigment;

//https://leetcode.com/problems/unique-paths-ii/description/
//63. Unique Paths II

import java.util.Arrays;
class UniquePathsWithObstacles {
    static void main(String[] args) {

        int[][] obstacleGrid = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        int memoizationAnswer = uniquePathsMemoization(obstacleGrid);

        int tabulationAnswer = uniquePathsTabulation(obstacleGrid);

        System.out.println("Memoization: " + memoizationAnswer);
        System.out.println("Tabulation: " + tabulationAnswer);
    }

    //MEMOIZATION
    static int uniquePathsMemoization(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(m - 1, n - 1, dp, obstacleGrid);
    }
    static int solve(int i, int j, int[][] dp, int[][] obstacleGrid) {

        // Out of bounds
        if (i < 0 || j < 0) {
            return 0;
        }
        // Obstacle
        if (obstacleGrid[i][j] == 1) {
            return 0;
        }
        // Starting cell
        if (i == 0 && j == 0) {
            return 1;
        }
        // Already calculated
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int up = solve(i - 1, j, dp, obstacleGrid);
        int left = solve(i, j - 1, dp, obstacleGrid);

        dp[i][j] = up + left;
        return dp[i][j];
    }

    //TABULATION
    public static int uniquePathsTabulation(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        // Starting cell is blocked
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        dp[0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // Skip starting cell
                if (i == 0 && j == 0) {
                    continue;
                }
                // Obstacle
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;
                }
                // From up
                if (i > 0) {
                    dp[i][j] += dp[i - 1][j];
                }
                // From left
                if (j > 0) {
                    dp[i][j] += dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }

}