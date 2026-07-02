package Assigment;

//https://leetcode.com/problems/valid-triangle-number/description/?envType=problem-list-v2&envId=two-pointers
//611. Valid Triangle Number

import java.util.Arrays;

public class ValidTriangleNumber {
    static void main(String[] args) {
        int[]nums={2,2,3,4};
        System.out.println(triangleNumber(nums));
    }
    static int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int c=nums.length-1;c>=2;c--){
            int left=0;
            int right=c-1;
            while(left<right){
                if(nums[left]+nums[right]>nums[c]){
                    count+=(right-left);
                    right--;
                }else{
                    left++;
                }
            }
        }
        return count;

    }
}
