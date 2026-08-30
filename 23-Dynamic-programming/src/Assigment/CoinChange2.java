package Assigment;

//https://leetcode.com/problems/coin-change-ii/
//518. Coin Change II

import java.util.Arrays;

public class CoinChange2 {
    static void main(String[] args) {
        int[]coins={1,2,5};
        int amount=11;
        System.out.println(change(amount,coins));
    }
    static int change(int amount, int[] coins) {
        int n=coins.length;
        int[][]dp=new int[n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(n - 1, amount, dp, coins);
    }
    static int solve(int i,int t,int[][]dp,int[]a){
        //base cases
        if(i==0){
            if(t%a[i]==0){
                return 1;
            }else{
                return 0;
            }
        }
        if(dp[i][t]!=-1){
            return dp[i][t];

        }
        int notTake=solve(i-1,t,dp,a);
        int take=0;

        if(a[i] <= t) {
            take=solve(i, t - a[i], dp, a);

        }
        dp[i][t]=take+notTake;

        return dp[i][t];
    }
}
