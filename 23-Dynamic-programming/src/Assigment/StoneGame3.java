package Assigment;

//https://leetcode.com/problems/stone-game-iii/
//1406. Stone Game III

public class StoneGame3 {
    static void main(String[] args) {

        int[] stoneValue = {1, 2, 3, 7};

        System.out.println(stoneGameIII(stoneValue));
    }
    static String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;

        int[] dp = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {

            int take = 0;
            dp[i] = Integer.MIN_VALUE;

            for (int k = 0; k < 3 && i + k < n; k++) {
                take += stoneValue[i + k];
                dp[i] = Math.max(dp[i], take - dp[i + k + 1]);
            }
        }

        if (dp[0] > 0) {
            return "Alice";
        } else if (dp[0] < 0) {
            return "Bob";
        } else {
            return "Tie";
        }
    }
}
