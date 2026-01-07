package assignment;

import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/description/
//Q.leetcode 645:Set mismatch
public class SetMismatch {
    //set mismatch means one element is repeated & one element is deleted
    //repeated==duplicate && deleted==missing
    static void main(String[] args) {
        int[] nums={1,2,2,4};
        System.out.println(Arrays.toString(cyclic(nums)));
    }

    static int[] cyclic(int[]nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if( nums[i]!=nums[correct]){
                //swap them
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        //search for a missing element
        for(int index=0;index< nums.length;index++){
            //1 case
            if(nums[index]!=index+1){
                //return nums[index] for duplicate & index+1 for missing element
                return new int[]{nums[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }

    //write a method for swap the indexes
    static void swap(int[]nums,int first,int secound){
        int temp=nums[first];
        nums[first]=nums[secound];
        nums[secound]=temp;
    }
}
