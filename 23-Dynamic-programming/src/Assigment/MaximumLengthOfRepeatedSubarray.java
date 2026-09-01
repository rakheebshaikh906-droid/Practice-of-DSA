package Assigment;

//https://leetcode.com/problems/maximum-length-of-repeated-subarray/
//718. Maximum Length of Repeated Subarray

public class MaximumLengthOfRepeatedSubarray {
    static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 2, 1};
        int[] nums2 = {3, 2, 1, 4, 7};

        int answer = findLength(nums1, nums2);

        System.out.println("Maximum Length of Repeated Subarray: " + answer);
    }

    static int findLength(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[][] dp = new int[m + 1][n + 1];

        int ans = 0;

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {

                if (nums1[i - 1] == nums2[j - 1]) {

                    dp[i][j] = 1 + dp[i - 1][j - 1];

                    ans = Math.max(ans, dp[i][j]);

                } else {

                    dp[i][j] = 0;
                }
            }
        }

        return ans;
    }
}