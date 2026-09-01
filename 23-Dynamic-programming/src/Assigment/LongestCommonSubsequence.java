package Assigment;

//https://leetcode.com/problems/longest-common-subsequence/description/
//1143. Longest Common Subsequence

import java.util.Arrays;

public class LongestCommonSubsequence {
    static void main(String[] args) {

        String text1 = "abcde";
        String text2 = "ace";

        String t=text1;


        int m = text1.length();
        int n = text2.length();

        // 1. Recursion
        int answer1 = recursion(text1, text2, m, n);

        // 2. Memoization
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], -1);
        }

        int answer2 = memoization(text1, text2, m, n, dp);

        // 3. Tabulation
        int answer3 = tabulation(text1, text2);

        // 4. Space Optimization
        int answer4 = spaceOptimization(text1, text2);


        // Print answers
        System.out.println("Recursion          : " + answer1);
        System.out.println("Memoization        : " + answer2);
        System.out.println("Tabulation         : " + answer3);
        System.out.println("Space Optimization : " + answer4);
    }
    // 1. RECURSION
    static int recursion(String text1, String text2, int i, int j) {


        // Base case
        if (i == 0 || j == 0) {
            return 0;
        }

        // Match
        if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
            return 1 + recursion(text1, text2, i - 1, j - 1);
        }

        // Not match
        return Math.max(
                recursion(text1, text2, i - 1, j),
                recursion(text1, text2, i, j - 1)
        );
    }
    // 2. MEMOIZATION / TOP-DOWN
    static int memoization(String text1, String text2, int i, int j, int[][] dp) {

        // Base case
        if (i == 0 || j == 0) {
            return 0;
        }

        // Already calculated
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // Match
        if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
            dp[i][j] = 1 + memoization(
                    text1,
                    text2,
                    i - 1,
                    j - 1,
                    dp
            );
        }

        // Not match
        else {
            dp[i][j] = Math.max(
                    memoization(text1, text2, i - 1, j, dp),
                    memoization(text1, text2, i, j - 1, dp)
            );
        }

        return dp[i][j];
    }
    // 3. TABULATION / BOTTOM-UP
    static int tabulation(String text1, String text2) {

        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m + 1][n + 1];
        // Base case
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = 0;
        }
        // Fill the table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // Match
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
                // Not match
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]
                    );
                }
            }
        }
        return dp[m][n];
    }
    // 4. SPACE OPTIMIZATION
    static int spaceOptimization(String text1, String text2) {

        int m = text1.length();
        int n = text2.length();

        int[] prev = new int[n + 1];
        int[] curr = new int[n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // Match
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {

                    curr[j] = 1 + prev[j - 1];

                }
                // Not match
                else {
                    curr[j] = Math.max(prev[j], curr[j - 1]);
                }
            }
            // Swap prev and curr
            int[] temp = prev;
            prev = curr;
            curr = temp;
        }
        return prev[n];
    }
}