package assignment;

//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/?envType=problem-list-v2&envId=binary-search
//2529. Maximum Count of Positive Integer and Negative Integer

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    static void main(String[] args) {
        int[]nums={-3,-2,-1,0,0,1,2};
        System.out.println(maximumCount(nums));
    }
    static  int maximumCount(int[] nums) {
        int n = nums.length;

        // first positive index
        int left = 0, right = n - 1;
        int firstPositive = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > 0) {
                firstPositive = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        int positive = n - firstPositive;

        // first non-negative index (>= 0)
        left = 0;
        right = n - 1;
        int firstNonNegative = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= 0) {
                firstNonNegative = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        int negative = firstNonNegative;

        return Math.max(positive, negative);
    }
}
