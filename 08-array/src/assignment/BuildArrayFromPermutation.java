package assignment;

//https://leetcode.com/problems/build-array-from-permutation/description/?envType=problem-list-v2&envId=array
//1920. Build Array from Permutation

import java.util.Arrays;
public class BuildArrayFromPermutation {
    static void main(String[] args) {
        int[]nums={5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
    static int[] buildArray(int[] nums) {
        int[]ans=new int[nums.length];

        for(int i=0;i< nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}
