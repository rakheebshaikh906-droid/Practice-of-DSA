package assignment;

//https://leetcode.com/problems/maximum-product-difference-between-two-pairs/solutions/7491150/1913-maximum-product-difference-between-8i545/
//1913. Maximum Product Difference Between Two Pairs
import java.util.Arrays;
public class MaximumProductDifference {
    static void main(String[] args) {
        int[]nums={4,2,5,9,7,4,8};
        System.out.println(maxProductDifference(nums));
    }
    static int maxProductDifference(int[] nums) {
        int temp=0;
        Arrays.sort(nums);
        int a=nums[nums.length-1];
        int b=nums[nums.length-2];
        int c=nums[0];
        int d=nums[1];

        int ans= (a * b) - (c * d);
        temp=Math.max(temp,ans);
        return temp;
    }
}

//int ans=(nums[i]*nums[i++])-(nums[i++]*nums[i++]);
// temp=Math.max(temp,ans);