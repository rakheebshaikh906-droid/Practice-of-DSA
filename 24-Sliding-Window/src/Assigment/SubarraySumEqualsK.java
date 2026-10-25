package Assigment;

//https://leetcode.com/problems/subarray-sum-equals-k/
//560. Subarray Sum Equals K

public class SubarraySumEqualsK {
    static void main(String[] args) {
        int[]nums={1,1,1,2,5,4};
        int k=2;

        System.out.println(subarraySum(nums,k));
    }
    public static int subarraySum(int[] nums, int k){
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
