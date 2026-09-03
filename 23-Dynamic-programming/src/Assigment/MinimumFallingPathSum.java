package Assigment;
import java.util.Arrays;

//https://leetcode.com/problems/minimum-falling-path-sum/description/
//931. Minimum Falling Path Sum


public class MinimumFallingPathSum {
    static void main(String[] args) {

        int[][] matrix = {
                {2, 1, 3},
                {6, 5, 4},
                {7, 8, 9}
        };

        System.out.println(minFallingPathSum(matrix));
    }

    public static int minFallingPathSum(int[][] matrix) {

        int m = matrix.length - 1;
        int n = matrix[0].length - 1;

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }

        int ans = Integer.MAX_VALUE;

        for (int j = 0; j <= n; j++) {
            ans = Math.min(ans, solve(m, j, dp, matrix));
        }

        return ans;
    }

    public static int solve(int i, int j, int[][] dp, int[][] a) {

        // Base case
        if (j < 0 || j >= a[0].length) {
            return Integer.MAX_VALUE;
        }

        if (i == 0) {
            return a[0][j];
        }

        // Already calculated
        if (dp[i][j] != Integer.MAX_VALUE) {
            return dp[i][j];
        }

        int up = a[i][j] + solve(i - 1, j, dp, a);

        int leftDia = Integer.MAX_VALUE;
        int rightDia = Integer.MAX_VALUE;

        // Left diagonal
        if (j > 0) {
            leftDia = a[i][j] + solve(i - 1, j - 1, dp, a);
        }

        // Right diagonal
        if (j < a[0].length - 1) {
            rightDia = a[i][j] + solve(i - 1, j + 1, dp, a);
        }

        dp[i][j] = Math.min(up, Math.min(leftDia, rightDia));

        return dp[i][j];
    }
}
