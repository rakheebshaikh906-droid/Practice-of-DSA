package Assigment;

public class MinCostDP {
    static void main(String[] args) {
        int n = 5;
        System.out.println("answer using dp:"+ minCostDp(n));
        System.out.println("answer using simple maths:"+minCostMath(n));
    }

    static int minCostDp(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + (i - 1);
        }

        return dp[n];
    }
    static int minCostMath(int n){
        int ans=0;
        while(n!=0){
            ans+=n-1;
            n--;
        }
        return ans;
    }
}