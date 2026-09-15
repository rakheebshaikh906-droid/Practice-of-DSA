package code;

//lecture no 17 dp series

import java.util.Arrays;
public class CountSubsetWithTotalSumK {
    static void main(String[] args) {
        int[]nums={1,2,3,4,5};
        int k=5;
        System.out.println("recursion:"+recursion(nums,k));
        System.out.println("memorization:"+ memorization(nums,k));
        System.out.println("tabulation:"+tabulation(nums,k));
        System.out.println("spaceOptimization:"+spaceOptimization(nums,k));
    }
    //------ recursion --------
    static int recursion(int[]nums,int k){
        int n=nums.length;
        return solve(n-1,k,nums);
    }
    static int solve(int i,int s,int[]a){
        //base case
        if(s==0) return 1;
        if(i==0){
            if(a[i]==s){
                return 1;
            }else{
                return 0;
            }
        }
        int notPick=solve(i-1,s,a);
        int pick=0;
        if(a[i]<=s){
            pick=solve(i-1,s-a[i],a);
        }
        return pick+notPick;
    }

    //------ memorization -------
    static int memorization(int[]nums,int k){
        int n=nums.length;
        int[][]dp=new int[n][k+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(n-1,k,dp,nums);

    }
    static int f(int i,int s,int[][]dp,int[]a){
        //base cases
        if(s==0) return 1;
        if(i==0){
            if(a[i]==s){
                return 1;
            }else{
                return 0;
            }
        }
        if(dp[i][s]!=-1){
            return dp[i][s];
        }
        //recursion copy past
        int notTake=f(i-1,s,dp,a);
        int take=0;
        if(a[i]<=s){
            take=f(i-1,s-a[i],dp,a);
        }
        dp[i][s]=take+notTake;

        return dp[i][s];
    }

    //------ tabulation ------
    static int tabulation(int[] nums, int k) {
        int n = nums.length;
        int[][] dp = new int[n][k + 1];

        // Sum 0 can always be formed by choosing nothing
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }
        // First element
        if (nums[0] <= k) {
            dp[0][nums[0]] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int s = 1; s <= k; s++) {
                int notTake = dp[i - 1][s];
                int take = 0;
                if (nums[i] <= s) {
                    take = dp[i - 1][s - nums[i]];
                }
                dp[i][s] = take + notTake;
            }
        }
        return dp[n - 1][k];
    }

    //---- space optimization
    static int spaceOptimization(int[] nums, int k) {
        int n = nums.length;
        int[] prev = new int[k + 1];
        // Sum 0
        prev[0] = 1;
        // First element
        if (nums[0] <= k) {
            prev[nums[0]] = 1;
        }
        for (int i = 1; i < n; i++) {
            int[] curr = new int[k + 1];
            curr[0] = 1;
            for (int s = 1; s <= k; s++) {
                int notTake = prev[s];
                int take = 0;
                if (nums[i] <= s) {
                    take = prev[s - nums[i]];
                }
                curr[s] = take + notTake;
            }

            prev = curr;
        }
        return prev[k];
    }
}
