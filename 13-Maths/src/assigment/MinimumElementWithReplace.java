package Assigment;

//https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/solutions/7483549/3300-minimum-element-after-replacement-w-h311/
//3300. Minimum Element After Replacement With Digit Sum

import java.util.Arrays;

public class MinimumElementWithReplace {
    static void main(String[] args) {
        int[] nums = {999, 19, 99};
        System.out.println(minElement(nums));
        System.out.println(minElement2(nums));
    }
    static int minElement(int[] nums) {
        for(int i =0; i<nums.length ; i++){
            nums[i] = helper(nums[i]);
        }

        return (nums[0]);
    }
    static int helper(int num) {
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans += rem;
            num /= 10;
        }
        return ans;
    }

    static int minElement2(int[]nums){
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            min = Math.min(min, digitSum(num));
        }

        return min;
    }
    static int digitSum (int num) {
        int ans = 0;
        while (num > 0) {
           int rem = num % 10;
            ans += rem;
            num /= 10;
        }
        return ans;
    }
}
