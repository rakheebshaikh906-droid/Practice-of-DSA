package code;

import java.util.Arrays;
/*
 * 0/1 Knapsack
 *
 * A thief wants to rob items from bags.
 * Every item has:
 *   1. Weight  -> how much capacity it takes
 *   2. Value   -> how much money/value it gives
 *
 * The thief has a bag with limited capacity W.
 *
 * We have to select items such that:
 *   - Total weight <= W
 *   - Total value is maximum
 *   - Each item can be selected AT MOST ONCE
 *
 * Example:
 *
 * wt    = {2, 3, 4}
 * value = {20, 30, 40}
 * W     = 5
 *
 * We can take:
 *   item 0 -> weight 2, value 20
 *   item 1 -> weight 3, value 30
 *
 * Total weight = 5
 * Total value  = 50
 *
 * Answer = 50
 */

public class knapsack01 {
    public static void main(String[] args) {

        int[] wt = {2, 3, 4};
        int[] value = {20, 30, 40};
        int w = 5;

        // 1. Recursion
        System.out.println("Recursion: " + recursion(wt, value, w));
        // 2. Memoization
        System.out.println("Memoization: " + memoization(wt, value, w));
        // 3. Tabulation
        System.out.println("Tabulation: " + tabulation(wt, value, w));
        // 4. Space Optimization
        System.out.println("Space Optimization: " + spaceOptimization(wt, value, w));
    }

    // 1. RECURSION
    static int recursion(int[] wt, int[] value, int w) {

        int n = wt.length;
        return solve(n - 1, w, wt, value);
    }

    static int solve(int i, int w, int[] wt, int[] value) {

        // Base case
        if (i == 0) {
            if (wt[0] <= w) {
                return value[0];
            }
            return 0;
        }

        // NOT TAKE
        int notTake = solve(i - 1, w, wt, value);

        // TAKE
        int take = 0;

        if (wt[i] <= w) {

            take = value[i]
                    + solve(i - 1, w - wt[i], wt, value);
        }

        return Math.max(take, notTake);
    }
    // 2. MEMOIZATION
    static int memoization(int[] wt, int[] value, int w) {

        int n = wt.length;

        int[][] dp = new int[n][w + 1];

        // -1 means state is not calculated yet
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solveMemo(n - 1, w, wt, value, dp);
    }

    static int solveMemo(int i, int w, int[] wt, int[] value, int[][] dp) {

        // Base case
        if (i == 0) {
            if (wt[0] <= w) {
                return value[0];
            }
            return 0;
        }

        // Already calculated
        if (dp[i][w] != -1) {
            return dp[i][w];
        }

        // NOT TAKE
        int notTake = solveMemo(i - 1, w, wt, value, dp);

        // TAKE
        int take = 0;
        if (wt[i] <= w) {
            take = value[i] + solveMemo(i - 1, w - wt[i], wt, value, dp);
        }
        return dp[i][w] = Math.max(take, notTake);
    }
    // 3. TABULATION
    static int tabulation(int[] wt, int[] value, int w) {

        int n = wt.length;

        int[][] dp = new int[n][w + 1];

        // Base case
        for (int capacity = wt[0]; capacity <= w; capacity++) {
            dp[0][capacity] = value[0];
        }

        // Build table
        for (int i = 1; i < n; i++) {
            for (int capacity = 0; capacity <= w; capacity++) {

                // NOT TAKE
                int notTake = dp[i - 1][capacity];

                // TAKE
                int take = 0;

                if (wt[i] <= capacity) {

                    take = value[i] + dp[i - 1][capacity - wt[i]];
                }
                dp[i][capacity] = Math.max(take, notTake);
            }
        }

        return dp[n - 1][w];
    }


    // =========================================================
    // 4. SPACE OPTIMIZATION
    // =========================================================

    static int spaceOptimization(int[] wt, int[] value, int w) {

        int n = wt.length;

        int[] dp = new int[w + 1];

        // Base case
        for (int capacity = wt[0]; capacity <= w; capacity++) {
            dp[capacity] = value[0];
        }

        // Build using only one array
        for (int i = 1; i < n; i++) {

            /*
             * IMPORTANT:
             *
             * Iterate capacity from RIGHT to LEFT.
             *
             * This ensures that the current item
             * is used only once.
             */
            for (int capacity = w; capacity >= wt[i]; capacity--) {

                int take = value[i]
                        + dp[capacity - wt[i]];

                int notTake = dp[capacity];

                dp[capacity] = Math.max(take, notTake);
            }
        }

        return dp[w];
    }
}