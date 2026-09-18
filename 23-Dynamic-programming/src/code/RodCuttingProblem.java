package code;

import java.util.Arrays;

public class RodCuttingProblem {
    static void main(String[] args) {
        int[]price={2,5,7,8,10};
        int n=5;

        System.out.println(recursion(price,n));
        System.out.println(memorization(price,n));
        System.out.println(tabulation(price,n));
        System.out.println(TwoSpaceOptimization(price,n));
        System.out.println(OneSpaceOptimization(price,n));
    }
    static int recursion(int[]price,int n){
        int m= price.length;
        return solve(m-1,n,price);

    }
    static int solve(int i,int t,int[]a){
        //base case
        if(i==0){
            if(t>0){
                return a[i]*t;
            }else{
                return Integer.MIN_VALUE;
            }
        }
        int notTake= 0 + solve(i-1,t,a);
        int take=Integer.MIN_VALUE;
        if(i+1<=t){
            take=a[i]+solve(i,t-(i+1),a);
        }
        return Math.max(take,notTake);
    }

    static int memorization(int[]price,int n){
        int m= price.length;
        int[][]dp=new int[m+1][n+1];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(m-1,n,price,dp);

    }
    static int f(int i,int t,int[]a,int[][]dp){
        //base case
        if(i==0){
            if(t>0){
                return a[i]*t;
            }else{
                return Integer.MIN_VALUE;
            }
        }
        if(dp[i][t]!=-1){
            return dp[i][t];
        }
        int notTake= 0 + f(i-1,t,a,dp);
        int take=Integer.MIN_VALUE;
        if(i+1<=t){
            take=a[i]+f(i,t-(i+1),a,dp);
        }
        dp[i][t]=Math.max(take,notTake);
        return dp[i][t];
    }

    static int tabulation(int[]price,int n){
        int m= price.length;
        int[][]dp=new int[m][n+1];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        //base case
        for(int j=0;j<=n;j++){
            dp[0][j] = price[0] * j;
        }
        for(int i=1;i<m;i++){
            for(int t=0;t<=n;t++){
                if(dp[i][t]!=-1){
                    return dp[i][t];
                }
                int notTake= 0 + dp[i-1][t];
                int take=Integer.MIN_VALUE;
                if(i+1<=t){
                    take=price[i]+dp[i][t-(i+1)];
                }
                dp[i][t]=Math.max(take,notTake);
            }
        }
        return dp[m-1][n];
    }
    static int TwoSpaceOptimization(int[]price,int n){
        int m= price.length;
        int[]prev=new int[n+1];
        int[]curr=new int[n+1];

        for(int j=0;j<=n;j++){
            curr[j] = price[0] * j;
        }
        for(int i=1;i<m;i++){
            for(int t=0;t<=n;t++){
                int notTake= 0 + prev[t];
                int take=Integer.MIN_VALUE;
                if(i+1<=t){
                    take=price[i]+curr[t-(i+1)];
                }
                curr[t]=Math.max(take,notTake);
            }
            prev=curr;

        }
        return prev[n];
    }
    static int OneSpaceOptimization(int[]price,int n){
        int m= price.length;
        int[]prev=new int[n+1];

        for(int j=0;j<=n;j++){
            prev[j] = price[0] * j;
        }
        for(int i=1;i<m;i++){
            for(int t=0;t<=n;t++){
                int notTake= 0 + prev[t];
                int take=Integer.MIN_VALUE;
                if(i+1<=t){
                    take=price[i]+prev[t-(i+1)];
                }
                prev[t]=Math.max(take,notTake);
            }

        }
        return prev[n];

    }

}
