package assignment;

//https://leetcode.com/problems/maximize-greatness-of-an-array/description/?envType=problem-list-v2&envId=two-pointers
//2592. Maximize Greatness of an Array

import java.util.Arrays;

public class MaximizeGreatnessOfAnArray {
    static void main(String[] args) {
        int[]nums={1,3,5,2,1,3,1};
        System.out.println(maximizeGreatness(nums));
    }
    static int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int left=0;
        int right=1;
        while(left>=0 && right<nums.length){
            if(nums[right]>nums[left]){
                count++;
                left++;
                right++;
            }else{
                right++;
            }
        }
        return count;

    }
}
