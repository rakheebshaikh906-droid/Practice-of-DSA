package code;

import java.util.Arrays;

public class FrogJumpKDistance {
    static void main(String[] args) {

        int[] height = {30, 10, 60, 10, 60, 50};
        int k = 2;

        int[] dp = new int[height.length];
        Arrays.fill(dp, -1);

        System.out.println("Memoization : " + memo(height.length - 1, height, k, dp));
        System.out.println("Tabulation  : " + tabulation(height, k));
    }

    //Memoization
    static int memo(int index, int[] height, int k, int[] dp) {
        if (index == 0) {
            return 0;
        }
        if (dp[index] != -1) {
            return dp[index];
        }
        int minCost = Integer.MAX_VALUE;

        for (int j = 1; j <= k; j++) {
            if (index - j >= 0) {
                int jump = memo(index - j, height, k, dp) + Math.abs(height[index] - height[index - j]);
                minCost = Math.min(minCost, jump);
            }
        }
        return dp[index] = minCost;
    }

    //Tabulation
    static int tabulation(int[] height, int k) {
        int n = height.length;
        int[] dp = new int[n];
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            int minCost = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {

                    int jump = dp[i - j] + Math.abs(height[i] - height[i - j]);
                    minCost = Math.min(minCost, jump);
                }
            }
            dp[i] = minCost;
        }

        return dp[n - 1];
    }

}