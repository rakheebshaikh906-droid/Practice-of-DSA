package assignment;

//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/solutions/7491099/1464-maximum-product-of-two-elements-in-1zyzo/
//1464. Maximum Product of Two Elements in an Array
public class MaximumProductOfTwoNumbers {
    static void main(String[] args) {
        int[]nums={1,5,4,5};
        System.out.println(maxProduct(nums));
    }
    static int maxProduct(int[] nums) {
        int count=0;
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                int ans=(nums[i]-1)*(nums[j]-1);
                count=Math.max(count,ans);
            }
        }
        return count;
    }
}
