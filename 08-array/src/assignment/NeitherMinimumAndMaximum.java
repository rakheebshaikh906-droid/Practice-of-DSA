package assignment;

//https://leetcode.com/problems/neither-minimum-nor-maximum/description/
//2733. Neither Minimum nor Maximum

import java.util.Arrays;

public class NeitherMinimumAndMaximum {
    static void main(String[] args) {
        int[]nums={3,2,1,4};
        System.out.println(findNonMinOrMax(nums));
    }
    static int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<=2){
            return -1;
        }
        return nums[1];
    }
}
