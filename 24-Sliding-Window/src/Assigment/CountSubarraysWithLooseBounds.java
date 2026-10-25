package Assigment;

//https://leetcode.com/problems/count-subarrays-with-loose-bounds/
//4089. Count Subarrays With Loose Bounds

public class CountSubarraysWithLooseBounds{
    static void main(String[] args) {
        int[]nums={1,4,7,3};
        int minK=1,maxK=5;
        System.out.println(countSubarrays(nums,minK,maxK));

    }
    public static long countSubarrays(int[] nums, int minK, int maxK) {
        long ans=0;
        int l=0;
        int r=0;
        int n=nums.length;

        while(r<n){
            if(nums[r]>=minK && nums[r]<=maxK){
                ans+=r-l+1;
            }else{
                l=r+1;
            }
            r++;
        }
        return ans;
    }
}
