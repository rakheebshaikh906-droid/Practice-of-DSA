package assignment;

//https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/description/?envType=problem-list-v2&envId=array
//2656. Maximum Sum With Exactly K Elements

public class MaximumSumWithExactlyKElements {
    static void main(String[] args) {
        int[]nums={1,2,3,4,5};
        int k=3;
        System.out.println(maximizeSum(nums,k));
    }
    static int maximizeSum(int[] nums, int k) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int sum=0;
        while(k>0){
            sum+=max;
            max++;
            k--;
        }
        return sum;
    }
}
