package Assigment;

//https://leetcode.com/problems/number-of-longest-increasing-subsequence/
//673. Number of Longest Increasing Subsequence

import java.util.Arrays;
public class NumberOfLongestIncreasingSubsequence {
    static void main(String[] args) {
        int [] nums={1,5,4,3,2,7,8,9,5,4,2,4,};
        System.out.println(findNumberOfLIS(nums));
    }
    static int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int[]dp=new int[n];
        Arrays.fill(dp,1);
        int[]cout=new int[n];
        Arrays.fill(cout,1);

        int maxi=1;
        for(int i=0;i<n;i++){
            for(int prev=0;prev<i;prev++){
                if(nums[i]>nums[prev] && 1+dp[prev]>dp[i]){
                    dp[i]=1+dp[prev];
                    cout[i]=cout[prev];
                }else if(nums[i]>nums[prev] && 1+dp[prev]==dp[i]){
                    cout[i]+=cout[prev];
                }
            }
            maxi=Math.max(maxi,dp[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(dp[i]==maxi){
                ans+=cout[i];
            }
        }
        return ans;
    }
}
