package Assigment;

//https://leetcode.com/problems/longest-increasing-subsequence/description/
//300. Longest Increasing Subsequence

import java.util.Arrays;
public class LargestIncreasingSubSequence {
    static void main(String[] args) {
        int[]nums={10,9,2,4,7,3,1,7,6,4,2,6,8,5,4};
        System.out.println(lengthOfLIS(nums));

    }
    public static int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][]dp=new int[n][n+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(0,-1,nums,dp);


    }
    public static int f(int idx,int prev_idx,int[]a,int[][]dp){
        if(idx==a.length){
            return 0;
        }
        if(dp[idx][prev_idx+1]!=-1){
            return dp[idx][prev_idx+1];
        }
        int not=f(idx+1,prev_idx,a,dp);
        int take=0;
        if(prev_idx==-1 || a[idx]>a[prev_idx]){
            take=1+f(idx+1,idx,a,dp);
        }
        return dp[idx][prev_idx+1]=Math.max(not,take);

    }
}
