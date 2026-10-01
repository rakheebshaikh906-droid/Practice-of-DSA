package Assigment;

//https://leetcode.com/problems/partition-array-for-maximum-sum/
//1043. Partition Array for Maximum Sum

import java.util.Arrays;
public class PartitionArrayForMaximumSum {
    static void main(String[] args) {
        int[]arr={1,15,7,9,2,5,10};
        int k=3;

        System.out.println(maxSumAfterPartitioning(arr,k));
    }
    public static int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int[]dp=new int[n];
        Arrays.fill(dp,-1);

        return f(0,arr,k,dp);

    }
    public static int f(int idx,int[]a,int k,int[]dp){
        //base case
        int n=a.length;
        if(idx==n) return 0;

        if(dp[idx]!=-1){
            return dp[idx];
        }

        int len=0;
        int max=Integer.MIN_VALUE;
        int maxAns=Integer.MIN_VALUE;

        for(int j=idx;j<Math.min(idx+k,n);j++){
            len++;
            max=Math.max(max,a[j]);
            int sum=len*max+f(j+1,a,k,dp);

            maxAns=Math.max(maxAns,sum);
        }
        return dp[idx]=maxAns;
    }
}
