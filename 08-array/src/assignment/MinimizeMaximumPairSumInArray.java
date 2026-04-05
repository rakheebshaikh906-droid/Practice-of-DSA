package assignment;

//https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/description/?envType=problem-list-v2&envId=two-pointers
//1877. Minimize Maximum Pair Sum in Array

import java.util.Arrays;

public class MinimizeMaximumPairSumInArray {
    static void main(String[] args) {
        int[]nums={3,5,4,2,4,6};
        System.out.println(minPairSum(nums));
    }
    static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right= nums.length-1;
        int max=Integer.MIN_VALUE;
        while(left<right){
            int sum=nums[left]+nums[right];
            left++;
            right--;
            max=Integer.max(max,sum);
        }
        return max;
    }
}
