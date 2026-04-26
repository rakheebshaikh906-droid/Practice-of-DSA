package Sorting;

import java.util.Arrays;

public class QuickSort {
    static void main(String[] args) {
        int[]nums={4,6,5,1,3,2};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    static void quickSort(int[] nums,int low,int high){
        //base case
        if(low>=high){
            return;
        }
        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot=nums[m];

        //also a reason why if its already sorted it will not swap
        //perform the operation for putting pivot at correct index
        while(s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            //its iteration occurs its means s ans e will not correct position means s<e then swap them
            if(s<=e){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
        //when everything is correct its means pivot a correct index
        //then sort the LHS of the pivot and RHS of the pivot

        //call the function
        //LHS
        quickSort(nums,low,e);
        //RHS
        quickSort(nums,s,high);
    }
}
