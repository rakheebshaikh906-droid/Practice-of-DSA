package Assigment;

import java.util.Arrays;

//https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/?envType=problem-list-v2&envId=sliding-window
//1984. Minimum Difference Between Highest and Lowest of K Scores

public class MinimumDifferentBetweenHighestAndLowe4st {
    static void main(String[] args) {
        int[]nums={1,3,4,4,6,6,7,9};
        int k=3;

        System.out.println(minimumDifference(nums,k));

    }
    public static int minimumDifference(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int n=nums.length;
        int l=0;
        int r=k-1;
        while(r<n){
            min=Math.min(min,nums[r]-nums[l]);
            l++;
            r++;
        }
        return min;
    }
}
