package Assigment;

import java.util.Arrays;

public class Buy_SellStock2 {
    static void main(String[] args) {
        int[]prices={7,1,5,3,6,4};
        System.out.println(memorization(prices));
        System.out.println(tabulation(prices));
        System.out.println(space(prices));
    }
    //memorization
    public static int memorization(int[] prices) {
        int n = prices.length;
        int[][]dp=new int[n][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(0,1,prices,dp);

    }
    public static int f(int i,int buy,int[]a,int[][]dp){
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
            profit=Math.max(-a[i]+f(i+1,0,a,dp),0+f(i+1,1,a,dp));
        }else{              //take             //notTake
            profit=Math.max(a[i]+f(i+1,1,a,dp),0+f(i+1,0,a,dp));
        }
        return dp[i][buy]=profit;
    }

    //tabulation
    public static int tabulation(int[] prices) {
        int n=prices.length;
        int[]curr=new int[n+1];
        int[]next=new int[n+1];

        //base case
        curr[0]=curr[1]=0;

        for(int i=n-1;i>=0;i--){
            for(int buy=0;buy<=1;buy++){
                int profit=0;
                //we can buy it
                if(buy==1){            //take             //notTake
                    profit=Math.max(-prices[i]+next[0],0+next[1]);
                }else{              //take             //notTake
                    profit=Math.max(prices[i]+next[1],0+next[0]);
                }
                curr[buy]=profit;
            }
            next=curr.clone();
        }
        return curr[1];
    }

    //spaceOptimization
    public static int space(int[] prices) {
        int n=prices.length;
        int[]curr=new int[n+1];
        int[]next=new int[n+1];

        //base case
        curr[0]=curr[1]=0;

        for(int i=n-1;i>=0;i--){
            for(int buy=0;buy<=1;buy++){
                int profit=0;
                //we can buy it
                if(buy==1){            //take             //notTake
                    profit=Math.max(-prices[i]+next[0],0+next[1]);
                }else{              //take             //notTake
                    profit=Math.max(prices[i]+next[1],0+next[0]);
                }
                curr[buy]=profit;
            }
            next=curr.clone();
        }
        return curr[1];
    }

}
