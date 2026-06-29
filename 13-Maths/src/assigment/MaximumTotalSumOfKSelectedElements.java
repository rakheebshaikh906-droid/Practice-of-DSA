package Assigment;

//https://leetcode.com/contest/weekly-contest-508/problems/maximum-total-sum-of-k-selected-elements/description/
//3974. Maximum Total Sum of K Selected Elements

import java.util.Arrays;
public class MaximumTotalSumOfKSelectedElements {
    static void main(String[] args) {
        int[]nums={6,1,2,9};
        int k=3;
        int mul=2;
        System.out.println(maxSum(nums,k,mul));
    }
    static long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long totalSum=0;
        int temp=mul;
        for(int i=nums.length-1;i>=nums.length-k;i--){
            totalSum += (long) nums[i] * Math.max(temp, 1);

            temp--;
        }
        return totalSum;

    }
}
