package Assigment;

//https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/?envType=problem-list-v2&envId=math
//3264. Final Array State After K Multiplication Operations I

import java.util.Arrays;
public class FinalArrayStateAfterKMultiplicationOperations {
    static void main(String[] args) {
        int [] nums={2,1,3,5,6};
        int k=5;
        int multiplier=2;
        System.out.println(Arrays.toString(getFinalState(nums,k,multiplier)));
    }

    static int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k > 0) {
            int min = Integer.MAX_VALUE;
            int x = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                    x = i;
                }
            }

            nums[x] = nums[x] * multiplier;
            k--;
        }

        return nums;
    }
}
