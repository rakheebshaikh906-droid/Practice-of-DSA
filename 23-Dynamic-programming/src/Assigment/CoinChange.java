package Assigment;

//https://leetcode.com/problems/coin-change/description/
//322. Coin Change

import java.util.Arrays;

public class CoinChange {
    static void main(String[] args) {

        CoinChange obj = new CoinChange();

        int[] coins = {1, 2, 5};
        int amount = 11;

        int ans = obj.coinChange(coins, amount);

        System.out.println("Minimum coins = " + ans);
    }
    static int coinChange(int[] coins, int amount) {

        int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans = solve(n - 1, amount, dp, coins);
        if (ans == Integer.MAX_VALUE) {
            return -1;
        }
        return ans;
    }
    static int solve(int i, int t, int[][] dp, int[] a) {

        // Base Case
        if (i == 0) {
            if (t % a[i] == 0) {
                return t / a[i];
            } else {
                return Integer.MAX_VALUE;
            }
        }

        // Already calculated
        if (dp[i][t] != -1) {
            return dp[i][t];
        }

        // Not Take
        int notTake = solve(i - 1, t, dp, a);

        // Take
        int take = Integer.MAX_VALUE;

        if (a[i] <= t) {

            int res = solve(i, t - a[i], dp, a);

            if (res != Integer.MAX_VALUE) {
                take = 1 + res;
            }
        }

        dp[i][t] = Math.min(take, notTake);

        return dp[i][t];
    }
}