package Assigment;

//https://leetcode.com/problems/subarray-product-less-than-k/description/?envType=problem-list-v2&envId=sliding-window
//713. Subarray Product Less Than K

public class SubarrayProductLessThanK {
    static void main(String[] args) {
        int[]nums={10,5,2,6};
        int k=100;
        System.out.println(numSubarrayProductLessThanK2(nums,k));
    }

    //time complexity = o(n2) this was not a good approach
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=i;j<nums.length;j++){
                product*=nums[j];
                if(product<k){
                    ans++;
                }else{
                    break;
                }
            }
        }
        return ans;
    }

    //we solve in o(n) time using sliding window
    public static int numSubarrayProductLessThanK2(int[] nums, int k) {

        if (k <= 1) {
            return 0;
        }

        int l = 0;
        int product = 1;
        int ans = 0;
        int r=0;
        while(r<nums.length){
            product*=nums[r];

            while(product>=k){
                product/=nums[l];
                l++;
            }
            ans+=r-l+1;
            r++;
        }
        return ans;
    }
}
