package code;

//https://www.hackerrank.com/challenges/game-of-two-stacks/problem?utm_source=chatgpt.com
// Game Of Two Stack

public class GameOfTwoStack {
    static int solve(int[] a, int[] b, int maxSum) {
        return helper(a, b, 0, 0, 0, maxSum);
    }

    static int helper(int[] a, int[] b, int i, int j, int sum, int maxSum) {

        // Base condition
        if (sum > maxSum) {
            return -1; // invalid move
        }

        int takeA = -1;
        int takeB = -1;

        // Take from stack A
        if (i < a.length) {
            takeA = helper(a, b, i + 1, j, sum + a[i], maxSum);
        }

        // Take from stack B
        if (j < b.length) {
            takeB = helper(a, b, i, j + 1, sum + b[j], maxSum);
        }

        int best = Math.max(takeA, takeB);

        // If both moves invalid, return 0
        if (best == -1) return 0;

        return best + 1;
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 4, 6, 1};
        int[] b = {2, 1, 8, 5};
        int maxSum = 10;

        System.out.println(solve(a, b, maxSum)); // Output: 4
    }
}
