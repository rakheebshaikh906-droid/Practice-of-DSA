package Assigment;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/description/
//309. Best Time to Buy and Sell Stock with Cooldown

import java.util.Arrays;
public class Buy_SellStockCoolDown {
    static void main(String[] args) {
        int[]prices={9,8,2,5,7,9,1,2,6,0,6};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int[][]dp=new int[n+1][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(0,1,prices,dp);

    }
    public static int f(int i,int buy,int[]a,int[][]dp){
        //base cases
        int n=a.length;
        if(i>=n){
            return 0;
        }
        if(dp[i][buy]!=-1){
            return dp[i][buy];
        }

        int profit=0;
        //we can buy it
        if(buy==1){            //take             //notTake
            profit=Math.max(-a[i]+f(i+1,0,a,dp),0+f(i+1,1,a,dp));
        }else{              //take             //notTake
            profit=Math.max(a[i]+f(i+2,1,a,dp),0+f(i+1,0,a,dp));
        }
        return dp[i][buy]=profit;
    }
}
