package Assigment;

//https://leetcode.com/problems/array-partition/description/?envType=problem-list-v2&envId=counting-sort
//561. Array Partition

import java.util.Arrays;
public class ArrayPartition {
    static void main(String[] args) {
        int[]nums={6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums));
    }
    static int arrayPairSum(int[]nums){
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}
