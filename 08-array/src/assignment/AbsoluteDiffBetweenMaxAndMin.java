package assignment;

//https://leetcode.com/problems/absolute-difference-between-maximum-and-minimum-k-elements/solutions/7498768/3774-absolute-difference-bet
//3774. Absolute Difference Between Maximum and Minimum K Elements

import java.util.Arrays;
public class AbsoluteDiffBetweenMaxAndMin {
    static void main(String[] args) {
        int[]nums={5,2,2,4};//after sort {2,2,3,4,5,6}
        int k=2;
        System.out.println(absDifference(nums,k));
    }
    static int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int maxSum=0;
        int minSum=0;
        for(int i=0;i<k;i++){
            maxSum+=nums[i];
        }
        for(int j= nums.length-k;j<nums.length;j++){
            minSum+=nums[j];
        }
        return Math.abs(maxSum-minSum);
    }
}
