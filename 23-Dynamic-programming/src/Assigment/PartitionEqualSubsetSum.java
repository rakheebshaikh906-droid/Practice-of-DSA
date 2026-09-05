package Assigment;

//https://leetcode.com/problems/partition-equal-subset-sum/description/
//416. Partition Equal Subset Sum

public class PartitionEqualSubsetSum {
    static void main(String[] args) {
        int[]nums={1,5,11,5};
        System.out.println(canPartition(nums));
    }
    static boolean canPartition(int[] nums) {
        int m = nums.length;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        int half = sum / 2;
        Boolean[][] dp = new Boolean[m][half + 1];

        return solve(m - 1, half, dp, nums);
    }
    static boolean solve(int i,int target,Boolean[][]dp,int[]a){
        //base cases
        if(target==0) return true;
        if(i==0) return (a[0]==target);

        if(dp[i][target]!=null){
            return dp[i][target];
        }
        boolean notTake=solve(i-1,target,dp,a);
        boolean take=false;
        if(a[i]<=target){
            take=solve(i-1,target-a[i],dp,a);
        }
        return dp[i][target]=notTake|take;

    }
}
