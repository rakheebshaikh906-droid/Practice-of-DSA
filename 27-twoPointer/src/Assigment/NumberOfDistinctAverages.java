
package Assigment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/maximum-number-of-distinct-averages/
// 2465. Number of Distinct Averages

public class NumberOfDistinctAverages {
    static void main(String[] args) {
        int[] nums = {4, 1, 4, 0, 3, 5};

        System.out.println(distinctAverages(nums));
    }

    public static int distinctAverages(int[] nums) {
        Arrays.sort(nums);

        Set<Double> set = new HashSet<>();

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            double ans = (nums[left] + nums[right]) / 2.0;

            set.add(ans);

            left++;
            right--;
        }

        return set.size();
    }
}
