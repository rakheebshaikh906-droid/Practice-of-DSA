package assignment;

import java.util.Arrays;

public class MissingNumber {
    static void main(String[] args) {
        int[]nums={3,0,1};
        System.out.println(cyclic(nums));

    }

    static int cyclic(int[]nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i]< nums.length && nums[i]!=nums[correct]){
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
            if(nums[index]!=index){
                return index;
            }
        }
        //2 case
        //if all numbers is correct,them missing indices is n
        return nums.length;

    }

    //write a method for swap the indexes
    static void swap(int[]nums,int first,int secound){
        int temp=nums[first];
        nums[first]=nums[secound];
        nums[secound]=temp;
    }
}
