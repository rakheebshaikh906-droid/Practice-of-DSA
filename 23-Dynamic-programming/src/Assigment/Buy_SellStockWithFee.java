package Assigment;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
//714. Best Time to Buy and Sell Stock with Transaction Fee

import java.util.Arrays;
public class Buy_SellStockWithFee {
    static void main(String[] args) {
        int[]prices={7,9,9,1,2,4,5,6,8,9,6,4,3};
        int fee=3;
        System.out.println(maxProfit(prices,fee));
    }
    public static int maxProfit(int[] prices, int fee) {

        int n = prices.length;
        int[][]dp=new int[n][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(0,1,prices,dp,fee);

    }
    public static int f(int i,int buy,int[]a,int[][]dp,int fe){
        //base cases
        int n=a.length;
        if(i==n){
            return 0;
        }
        if(dp[i][buy]!=-1){
            return dp[i][buy];
        }

        int profit=0;
        //we can buy it
        if(buy==1){            //take             //notTake
            profit=Math.max(-a[i]+f(i+1,0,a,dp,fe),0+f(i+1,1,a,dp,fe));
        }else{              //take             //notTake
            profit=Math.max(a[i]-fe+f(i+1,1,a,dp,fe),0+f(i+1,0,a,dp,fe));
        }
        return dp[i][buy]=profit;
    }
}
