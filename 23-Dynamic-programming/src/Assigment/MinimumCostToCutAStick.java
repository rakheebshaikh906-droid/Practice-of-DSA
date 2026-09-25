package Assigment;

//https://leetcode.com/problems/minimum-cost-to-cut-a-stick/description/
//1547. Minimum Cost to Cut a Stick

import java.util.Arrays;
public class MinimumCostToCutAStick {
    static void main(String[] args) {
        int[] cuts = {1, 4, 5, 3};
        int n = 7;
        System.out.println(minimumCost(cuts, n));
    }
    static int minimumCost(int[] cuts, int n) {
        // Create array with boundaries
        int[] a = new int[cuts.length + 2];

        a[0] = 0;
        a[a.length - 1] = n;

        for (int i = 0; i < cuts.length; i++) {
            a[i + 1] = cuts[i];
        }
        Arrays.sort(a);
        int[][]dp=new int[a.length][a.length];
        for (int[] i : dp) {
            Arrays.fill(i, -1);
        }

        return f(1, cuts.length, a,dp);
    }
    private static int f(int i, int j, int[] a,int[][]dp) {
        // No cut remaining
        if (i > j) {
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int min = Integer.MAX_VALUE;
        for (int idx = i; idx <= j; idx++) {
            int cost = a[j + 1] - a[i - 1] + f(i, idx - 1, a,dp) + f(idx + 1, j, a,dp);
            min = Math.min(min, cost);
        }
        return dp[i][j]=min;
    }
}