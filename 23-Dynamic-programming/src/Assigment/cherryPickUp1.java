package Assigment;

//https://leetcode.com/problems/cherry-pickup/description/
//741. Cherry Pickup
//hard
import java.util.Arrays;
public class cherryPickUp1 {
    static void main(String[] args) {
        int[][]grid={
                {0,1,-1},
                {1,0,-1},
                {1,1,1}
        };
        System.out.println(cherryPickup(grid));

    }
    static int cherryPickup(int[][] grid) {

        int n = grid.length;

        int[][][] dp = new int[2 * n - 1][n][n];

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return Math.max(0, solve(0, 0, 0, dp, grid));
    }

    static int solve(int step, int i1, int i2,int[][][] dp, int[][] a) {

        int n = a.length;
        // Columns
        int j1 = step - i1;
        int j2 = step - i2;

        // Invalid positions
        if (i1 < 0 || i2 < 0 ||i1 >= n || i2 >= n ||j1 < 0 || j2 < 0 ||
                j1 >= n || j2 >= n) {
            return Integer.MIN_VALUE;
        }

        // Thorn
        if (a[i1][j1] == -1 || a[i2][j2] == -1) {
            return Integer.MIN_VALUE;
        }

        // Destination
        if (step == 2 * n - 2) {
            return a[i1][j1];
        }
        if (dp[step][i1][i2] != -1) {
            return dp[step][i1][i2];
        }

        // Pick cherries
        int value;

        if (i1 == i2 && j1 == j2) {
            value = a[i1][j1];
        } else {
            value = a[i1][j1] + a[i2][j2];
        }

        // Both go down
        int downDown = solve(step + 1,i1 + 1,i2 + 1,dp,a);

        // First down, second right
        int downRight = solve(step + 1,i1 + 1,i2,dp,a);

        // First right, second down
        int rightDown = solve(step + 1,i1,i2 + 1,dp,a);

        // Both go right
        int rightRight = solve(step + 1,i1,i2,dp,a);

        int max = Math.max(Math.max(downDown, downRight),
                Math.max(rightDown, rightRight)

        );
        return dp[step][i1][i2] = value + max;
    }
}
