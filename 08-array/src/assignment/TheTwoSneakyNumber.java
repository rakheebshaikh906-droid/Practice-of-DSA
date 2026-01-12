package assignment;

//https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/submissions/1882618306/?envType=problem-list-v2&envId=array
//3289. The Two Sneaky Numbers of Digitville
import java.util.Arrays;

public class TheTwoSneakyNumber {
    static void main(String[] args) {
        int[] nums={0,3,2,1,3,2};
        System.out.println(Arrays.toString(getSneakyNumbers(nums)));
    }
    static int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int[]ans=new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                ans[index]=nums[i];
                index++;
                i++;
            }
        }

        return Arrays.copyOf(ans,index);
    }
}
