package Assigment;

//https://leetcode.com/problems/sum-of-variable-length-subarrays/description/?envType=problem-list-v2&envId=prefix-sum
//3427. Sum of Variable Length Subarrays

public class SumOfVariableLengthSubarrays {
    static void main(String[] args) {
        int[]nums={3,1,1,2};
        System.out.println(subarraySum(nums));
    }
    static int subarraySum(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            int start=Math.max(0,i-nums[i]);
            for(int j=start;j<=i;j++){
                sum+=nums[j];
            }
        }
        return sum;
    }
}
