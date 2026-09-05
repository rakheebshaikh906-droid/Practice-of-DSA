package assignment;

//https://leetcode.com/problems/smallest-stable-index-i/description/
//3903. Smallest Stable Index I

public class SmallestStableIndex1 {
    static void main(String[] args) {
        int[]nums={5,9,1,2};
        int k=3;
        System.out.println(firstStableIndex(nums,k));
    }
    static int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] suffixMin = new int[n];
        suffixMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
        }
        int prefixMax = nums[0];
        for (int i = 0; i < n; i++) {
            prefixMax = Math.max(prefixMax, nums[i]);
            if (prefixMax - suffixMin[i] <= k) {
                return i;
            }
        }
        return -1;
    }
}
