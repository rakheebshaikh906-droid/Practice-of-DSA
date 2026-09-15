package code;

// Frog jump problem
/*A frog is crossing a river by jumping on stones. The frog starts at the first stone (index 0)
and wants to reach the last stone (index n - 1).Given an integer array heights, where heights[i]
represents the height of the i-th stone, the frog can jump either to the next stone or skip one
stone (i.e., from i to i + 1 or i + 2).The cost of a jump from stone i to stone j is |heights[i] - heights[j]|.
Return the minimum total cost required to reach the last stone.*/

import java.util.Arrays;
public class FrogJump {
    static void main(String[] args) {
        int[] heights = {10, 20, 30, 10};

        int[] dp = new int[heights.length];
        Arrays.fill(dp, -1);

        System.out.println("Memoization        : " + memo(heights.length - 1, heights, dp));
        System.out.println("Tabulation         : " + tabulation(heights));
        System.out.println("Space Optimization : " + spaceOptimization(heights));
    }

    //Memoization ( top-down)
    static int memo(int index, int[] h, int[] dp) {
        if (index == 0) {
            return 0;
        }
        if (dp[index] != -1) {
            return dp[index];
        }
        int left = memo(index - 1, h, dp) + Math.abs(h[index] - h[index - 1]);

        int right = Integer.MAX_VALUE;

        if (index > 1) {
            right = memo(index - 2, h, dp) + Math.abs(h[index] - h[index - 2]);
        }

        return dp[index] = Math.min(left,right);
    }

    //Tabulation(bottom-up)
    static int tabulation(int[] h) {
        int n = h.length;
        int[] dp = new int[n];
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            int left = dp[i - 1] + Math.abs(h[i] - h[i - 1]);

            int right = Integer.MAX_VALUE;

            if (i > 1) {
                right = dp[i - 2] + Math.abs(h[i] - h[i - 2]);
            }

            dp[i] = Math.min(left,right);
        }
        return dp[n - 1];
    }

    //Space Optimization
    static int spaceOptimization(int[] h) {
        int prev = 0;
        int prev2 = 0;

        for (int i = 1; i < h.length; i++) {
            int left = prev + Math.abs(h[i] - h[i - 1]);

            int right = Integer.MAX_VALUE;

            if (i > 1) {
                right = prev2 + Math.abs(h[i] - h[i - 2]);
            }

            int curr = Math.min(left,right);

            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}