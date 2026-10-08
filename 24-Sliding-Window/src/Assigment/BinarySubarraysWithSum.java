package Assigment;

//https://leetcode.com/problems/binary-subarrays-with-sum/
//930. Binary Subarrays With Sum

public class BinarySubarraysWithSum {
    static void main(String[] args) {
        int[]nums={1,0,1,0,1};
        int k=2;
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    private static int atMost(int[] nums, int goal) {
        if (goal < 0) {
            return 0;
        }

        int l = 0;
        int sum = 0;
        int ans = 0;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];

            while (sum > goal) {
                sum -= nums[l];
                l++;
            }

            // All subarrays ending at r
            ans += r - l + 1;
        }

        return ans;
    }
}
