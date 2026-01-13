package assignment;

//https://leetcode.com/problems/number-of-good-pairs/?envType=problem-list-v2&envId=array
//1512. Number of Good Pairs

import java.util.Arrays;
public class NumberOfGoodPairs {
    static void main(String[] args) {
        int[]nums={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    static int numIdenticalPairs(int[] nums) {
        int count=0;
        int k=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                k++;
            }else {
                count += k * (k - 1) / 2;
                k = 1; // reset for new number
            }
        }
        //last group
         count+=k*(k-1)/2;
        return count;
    }
}

