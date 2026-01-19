package assignment;

//https://leetcode.com/problems/partition-array-according-to-given-pivot/description/
//2161. Partition Array According to Given Pivot

import java.util.ArrayList;
import java.util.Arrays;

public class PartitionArrayAccordingToGivenPivot {
    static void main(String[] args) {
        int[]nums={9,12,5,10,14,3,10};
        int pivot=10;
        System.out.println(Arrays.toString(pivotArray(nums,pivot)));
        System.out.println(Arrays.toString(pivotArray2(nums,pivot)));
    }
    static int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer>less=new ArrayList<>();
        ArrayList<Integer>equal=new ArrayList<>();
        ArrayList<Integer>greater=new ArrayList<>();

        for(int i=0;i<nums.length;i++){

            if(nums[i]<pivot){
                less.add(nums[i]);
            } else if (nums[i]==pivot) {
                equal.add(nums[i]);
            }else{
                greater.add(nums[i]);
            }
        }
        int[]ans=new int[nums.length];
        int index=0;

        for(int x : less) ans[index++]=x;
        for(int y : equal) ans[index++]=y;
        for(int z : greater) ans[index++]=z;

        return ans;
    }
    //more optimal method
    static int[] pivotArray2(int[]nums,int pivot){
        int n=nums.length;
        int ans[]=new int[n];
        int index =0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                ans[index]=nums[i];
                index++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                ans[index]=nums[i];
                index++;
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                ans[index]=nums[i];
                index++;
            }
        }
        return ans;
    }
}
