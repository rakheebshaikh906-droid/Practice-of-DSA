package assignment;

//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
//1752. Check if Array Is Sorted and Rotated
public class Sorted_Rotated {
    static void main(String[] args) {
        int[]nums={3,4,5,1,2};
        System.out.println(check(nums));
    }
    static boolean check(int[] nums) {
        int n=nums.length;
        int breakPoint=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]) breakPoint++;
        }
        if(nums[n-1]>nums[0]) breakPoint++;
        return breakPoint<=1;
    }
}
