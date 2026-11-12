
package Assigment;

// https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/
// 1855. Maximum Distance Between a Pair of Values

public class MaximumDistanceBetweenPairOfValues {

    static void main(String[] args) {
        int[] nums1 = {55, 30, 5, 4, 2};
        int[] nums2 = {100, 20, 10, 10, 5};

        System.out.println(maxDistance(nums1, nums2));
    }

    public static int maxDistance(int[] nums1, int[] nums2) {
        int left = 0;
        int right = 0;
        int max = 0;

        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] <= nums2[right]) {
                max = Math.max(max, right - left);
                right++;
            } else {
                left++;
            }
        }

        return max;
    }
}
