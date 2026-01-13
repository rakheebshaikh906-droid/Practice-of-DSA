package assignment;

import java.util.Arrays;

public class NumberAreSmallerThan {
    static void main(String[] args) {
        int[]nums={6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        int index=0;
        for(int i=0;i< nums.length;i++){
            int count=0;
            for(int j=0;j< nums.length;j++){
                if(nums[i]!=nums[j] && nums[i]>nums[j]){
                    count+=1;
                }
            }
            ans[index]=count;
            index++;
        }
        return ans;
    }
}
