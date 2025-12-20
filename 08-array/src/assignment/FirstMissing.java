package assignment;
//https://leetcode.com/problems/first-missing-positive/description/
//leetcode Q.41 first missing positive
import java.util.Arrays;

public class FirstMissing {
    static void main(String[] args) {
        int[]nums={3,4,-1,1};
        System.out.println(Firstmissingnumber(nums));
    }

    static int Firstmissingnumber(int[]nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]>0 && nums[i]<= nums.length && nums[i]!=nums[correct]){
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
                return index+1;
            }
        }
        //case 2
        return nums.length+1;
    }

    //write a method for swap the indexes
    static void swap(int[]nums,int first,int secound){
        int temp=nums[first];
        nums[first]=nums[secound];
        nums[secound]=temp;
    }
}
