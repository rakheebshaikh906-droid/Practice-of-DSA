package Assigment;

//https://leetcode.com/problems/count-subarrays-with-score-less-than-k/
//2302. Count Subarrays With Score Less Than K

public class CountSubarraysWithScoreLessThanK {
    static void main(String[] args) {
         int[]nums={2,1,3,4,5,3};
         long k=10;
        System.out.println(countSubarrays(nums,k));
    }
    public static  long countSubarrays(int[] nums, long k) {
        int l=0;
        int r=0;
        long ans=0;
        long sum=0;
        while(r<nums.length){
            sum+=nums[r];
            while (sum * (r - l + 1) >= k) {
                sum -= nums[l];
                l++;
            }
            ans+=r-l+1;
            r++;
        }
        return ans;
    }
}
