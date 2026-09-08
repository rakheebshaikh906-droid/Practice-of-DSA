package Assigment;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
//123. Best Time to Buy and Sell Stock III


import java.util.Arrays;
public class Buy_SellStock3 {
    static void main(String[] args) {
        int[]prices={3,3,5,0,0,3,1,4};
        System.out.println(memorization(prices));
        System.out.println(tabulation(prices));
    }
    public static int memorization (int[] prices) {
        int n=prices.length;
        int [][][]dp=new int[n][2][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return f(0,1,2,prices,dp);

    }
    public static int f(int i,int buy,int cap,int[]a,int[][][]dp){
        int n=a.length;
        //base cases
        if(cap==0) return 0;
        if(i==n) return 0;
        if(dp[i][buy][cap]!=-1){
            return dp[i][buy][cap];
        }
        int profit=0;

        if(buy==1){
            profit=Math.max(-a[i]+f(i+1,0,cap,a,dp),0+f(i+1,1,cap,a,dp));
        }else{
            profit=Math.max(a[i]+f(i+1,1,cap-1,a,dp),0+f(i+1,0,cap,a,dp));
        }
        return dp[i][buy][cap]=profit;
    }

    //tabulation
    public static int tabulation(int[]prices){
        int n=prices.length;
        int[][][]dp=new int[n+1][2][3];
        //base cases
        for(int i=0;i<n;i++){
            for(int buy=0;buy<=1;buy++){
                dp[i][buy][0]=0;
            }
        }
        for(int buy=0;buy<=1;buy++){
            for(int cap=0;cap<=2;cap++){
                dp[n-1][buy][cap]=0;
            }
        }

        for(int i=n-1;i>=0;i--){
            for(int buy=0;buy<=1;buy++){
                for(int cap=1;cap<=2;cap++){
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
        return dp[0][1][2];

    }
}
