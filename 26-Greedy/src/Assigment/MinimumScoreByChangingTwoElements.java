package Assigment;

//https://leetcode.com/problems/minimum-score-by-changing-two-elements/description/?envType=daily-question&envId=2026-11-19
//2567. Minimum Score by Changing Two Elements\

public class MinimumScoreByChangingTwoElements {
    static void main(String[] args) {
        int[]nums={1,4,7,8,5};
        System.out.println(minimizeSum(nums));

    }
    public static int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        if (n == 3) {
            return 0;
        }
        int a = nums[n-3] - nums[0];
        int b = nums[n-2] - nums[1];
        int c = nums[n-1] - nums[2];

        return Math.min(a, Math.min(b, c));
    }
}
