package assignment;

//https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/?envType=problem-list-v2&envId=array
//3423. Maximum Difference Between Adjacent Elements in a Circular Array

public class MaximumDifferentBetweenAdjacent {
    static void main(String[] args) {
        int[]nums={-5,-10,-5};
        System.out.println(maxAdjacentDistance(nums));
    }
    static int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int ans=Math.abs(nums[0]-nums[n-1]);
        for(int i=1;i<n;i++){
            int ans2=Math.abs(nums[i]-nums[i-1]);
            ans=Math.max(ans,ans2);
        }
        return ans;
    }
}
