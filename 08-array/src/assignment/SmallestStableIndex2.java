package assignment;

//https://leetcode.com/problems/smallest-stable-index-ii/
//3904. Smallest Stable Index II

public class SmallestStableIndex2 {
    static void main(String[] args) {
        int[]nums={5,0,1,4};
        int k=3;
        System.out.println(firstStableIndex(nums,k));
    }
    static int firstStableIndex(int[] nums, int k) {
        // int n=nums.length;

        // int[]prefixmax=new int[n];
        // int[]suffixMin=new int[n];

        // prefixmax[0]=nums[0];
        // for(int i=1;i<n;i++){
        //     prefixmax[i]=Math.max(prefixmax[i-1],nums[i]);
        // }
        // suffixMin[n-1]=nums[n-1];
        // for(int j=n-2;j>=0;j--){
        //     suffixMin[j]=Math.min(suffixMin[j+1],nums[j]);
        // }
        // int ans=Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //     int val=prefixmax[i]-suffixMin[i];
        //     if(val<=k){
        //         ans=Math.min(ans,i);
        //     }
        // }
        // if(ans==2147483647){
        //     return -1;
        // }
        // return ans;

        //optimal version
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
