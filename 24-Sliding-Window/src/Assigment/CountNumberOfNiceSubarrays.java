package Assigment;

//https://leetcode.com/problems/count-number-of-nice-subarrays/description/
//1248. Count Number of Nice Subarrays

public class CountNumberOfNiceSubarrays {
    static void main(String[] args) {
         int[]nums={2,2,2,1,2,2,1,2,2,2};
         int k=2;

        System.out.println(numberOfSubarrays(nums,k));
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private static int atMost(int[] nums, int goal) {
        if (goal < 0) {
            return 0;
        }

        int l = 0;
        int sum = 0;
        int ans = 0;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r]%2; //if its even they add 0 if its odd they add 1

            while (sum > goal) {
                sum -= nums[l]%2;
                //if its even they add 0 if its odd they add 1
                l++;
            }

            // All subarrays ending at r
            ans += r - l + 1;
        }

        return ans;
    }
}
