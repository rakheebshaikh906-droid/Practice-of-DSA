package assignment;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
//167. Two Sum II - Input Array Is Sorted
public class TwoSum2 {
    static void main(String[] args) {
        int[]numbers={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
    static int[] twoSum(int[]numbers,int target){
        int start=0;
        int end= numbers.length-1;

        while(start<end){
            if(numbers[start]+numbers[end]==target){
                return new int[]{start+1,end+1};
            }

            if(numbers[start]+numbers[end]>target){
                end--;
            }else{
                start++;
            }
        }
        return new int[]{-1,-1};
    }
}
