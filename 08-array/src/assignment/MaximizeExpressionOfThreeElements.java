package assignment;

//https://leetcode.com/problems/maximize-expression-of-three-elements/description/?envType=problem-list-v2&envId=array
//3745. Maximize Expression of Three Elements

import java.util.Arrays;

public class MaximizeExpressionOfThreeElements {
    static void main(String[] args) {
        int[]nums={-2,0,5,-2,4};
        System.out.println(maximizeExpressionOfThree(nums));
    }
    static int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int a=nums[nums.length-1];
        int b=nums[nums.length-2];
        int c=nums[0];

        return a+b-c;

    }
}
