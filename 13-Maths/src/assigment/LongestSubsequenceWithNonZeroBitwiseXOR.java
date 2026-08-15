package Assigment;

//https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/description/
//3702. Longest Subsequence With Non-Zero Bitwise XOR

public class LongestSubsequenceWithNonZeroBitwiseXOR {
    static void main(String[] args) {
        int[] nums = {2,3,4};
        System.out.print(longestSubsequence(nums));
    }
    static int longestSubsequence(int[] nums) {
        int xor = 0;
        boolean nonZero = false;

        for (int num : nums) {
            xor ^= num;

            if (num != 0) {
                nonZero = true;
            }
        }
        if (xor != 0) {
            return nums.length;
        }
        if (nonZero) {
            return nums.length - 1;
        }
        return 0;
    }
}
