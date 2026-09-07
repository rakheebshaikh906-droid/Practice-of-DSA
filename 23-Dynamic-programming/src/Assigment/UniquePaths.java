package Assigment;

//https://leetcode.com/problems/unique-paths/description/
//62. Unique Paths

class UniquePaths {
    static void main(String[] args) {

        int m = 3;
        int n = 7;

        System.out.println("Number of unique paths: " + uniquePaths(m, n));
    }

    static int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        return solve(m, n, dp);
    }

    static int solve(int m, int n, int[][] dp) {
        if (m == 1 || n == 1) {
            return 1;
        }
        if (dp[m][n] != 0) {
            return dp[m][n];
        }
        int left = solve(m - 1, n, dp);
        int right = solve(m, n - 1, dp);

        dp[m][n] = left + right;

        return dp[m][n];
    }
}