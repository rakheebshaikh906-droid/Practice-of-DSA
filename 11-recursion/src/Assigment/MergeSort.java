package Assigment;

import java.util.Arrays;

//https://leetcode.com/problems/sort-an-array/description/
//912. Sort an Array
public class MergeSort {
    static void main(String[] args) {
        int[]nums={5,1,1,2,0,0};
        nums=sortArray(nums);
        System.out.println(Arrays.toString(nums));

    }
    static int[] sortArray(int[] nums) {
        //base case
        if(nums.length==1){
            return nums;
        }
        int mid=nums.length/2;

        //divide into two parts of array
        int[]left=sortArray(Arrays.copyOfRange(nums,0,mid));
        int[]right=sortArray(Arrays.copyOfRange(nums,mid,nums.length));

        return merge(left,right);
    }
    private static int[] merge(int[]first,int[]second){
        //create a new mix array for merge both dividing parts
        int[] mix= new int[first.length+ second.length];

        //take a pointers for first half,second half and mix array
        int i=0;
        int j=0;
        int k=0;

        while(i<first.length && j< second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the array is not complete
        //copy the remaining element
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}
