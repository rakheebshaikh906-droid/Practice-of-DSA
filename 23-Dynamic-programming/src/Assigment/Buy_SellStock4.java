package Assigment;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/description/
//188. Best Time to Buy and Sell Stock IV

public class Buy_SellStock4 {
    static void main(String[] args) {
        int[]prices={2,4,5,6,7,8,9,2,1,5,7};
        int k=3;
        System.out.println(maxProfit(k,prices));
    }
    public static int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int[][][]dp=new int[n+1][2][k+1];
        //base cases
        for(int i=0;i<n;i++){
            for(int buy=0;buy<=1;buy++){
                dp[i][buy][0]=0;
            }
        }
        for(int buy=0;buy<=1;buy++){
            for(int cap=0;cap<=k;cap++){
                dp[n-1][buy][cap]=0;
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int buy=0;buy<=1;buy++){
                for(int cap=1;cap<=k;cap++){
                    int profit=0;
                    if(buy==1){
                        profit=Math.max(-prices[i]+dp[i+1][0][cap],dp[i+1][1][cap]);
                    }else{
                        profit=Math.max(prices[i]+dp[i+1][1][cap-1],dp[i+1][0][cap]);
                    }
                    dp[i][buy][cap]=profit;
                }
            }
        }
        return dp[0][1][k];
    }
}
