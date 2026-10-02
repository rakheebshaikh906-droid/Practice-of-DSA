package Assigment;

//https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=problem-list-v2&envId=sliding-window
//643. Maximum Average Subarray I

public class MaximumAverageSubarray1 {
    static void main(String[] args) {
        int[]nums={1,12,-5,-6,50,3};
        int k=4;

        System.out.println("maximum average is:"+findMaxAverage(nums,k));

    }
    public static double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int l=0;
        int r=k-1;
        for(int i=l;i<=r;i++){
            sum+=nums[i];
        }
        int maxSum=sum;
        while(r<n-1){
            sum=sum-nums[l];
            l++;
            r++;
            sum=sum+nums[r];
            maxSum=Math.max(maxSum,sum);
        }
        return (double) maxSum/k;
    }
}
