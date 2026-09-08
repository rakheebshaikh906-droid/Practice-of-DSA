package Assigment;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//121. Best Time to Buy and Sell Stock

public class Buy_SellStock1 {
    static void main(String[] args) {
        int[]prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(min,prices[i]);
        }
        return profit;
    }
}
