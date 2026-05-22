package Assigment;


//https://leetcode.com/problems/divide-an-array-into-subarrays-with-minimum-cost-i/?envType=problem-list-v2&envId=sorting
//3010. Divide an Array Into Subarrays With Minimum Cost I

public class DivideArrayIntoSubarraysWithMinimumCost {
    static void main(String[] args) {
        int[]nums={10,3,1,1};
        System.out.println(minimumCost(nums));
    }
    static int minimumCost(int[]nums){
        int sum=0;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if (nums[i] < min1) {
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2 ) {
                min2 = nums[i];
            }
        }
        return sum+=nums[0]+min1+min2;


    }
}
