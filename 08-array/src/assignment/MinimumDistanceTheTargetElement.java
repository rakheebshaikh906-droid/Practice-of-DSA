package assignment;

//https://leetcode.com/problems/minimum-distance-to-the-target-element/description/
//1848. Minimum Distance to the Target Element

public class MinimumDistanceTheTargetElement {
    static void main(String[] args) {
        int[]nums={1,2,3,4,5};
        int target=5;
        int start=3;
        System.out.println(getMinDistance(nums,target,start));
    }
    static int getMinDistance(int[] nums, int target, int start) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                 min=Math.min(min,Math.abs(i-start));
            }
        }
        return min;

    }
}
