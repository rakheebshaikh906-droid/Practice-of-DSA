package assignment;

//https://leetcode.com/problems/maximum-product-pair-with-target-sum/
//4074. Maximum Product Pair With Target Sum

import java.util.Arrays;
public class MaximumProductPairWithTargetSum {
    static void main(String[] args) {
        int[]nums={1,2,3,4};
        int target=5;

        System.out.println(Arrays.toString(maxProductPair(nums,target)));

    }
    public static int[] maxProductPair(int[] nums, int target) {
        int maxProduct = Integer.MIN_VALUE;
        int[] ans = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if (i != j && nums[i] + nums[j] == target
                        && nums[i] > nums[j]) {

                    int product = nums[i] * nums[j];

                    if (product > maxProduct) {
                        maxProduct = product;
                        ans = new int[]{i, j};
                    }
                }
            }
        }
        return ans;
    }
}
