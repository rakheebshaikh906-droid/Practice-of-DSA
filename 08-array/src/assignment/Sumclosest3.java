package assignment;
//https://leetcode.com/problems/3sum-closest/description/
//leetcode(16) 3sumclosest

import java.util.Arrays;
public class Sumclosest3 {
    static void main(String[] args){
        int[]nums={-1,2,1,-4};
        int target=1;
        System.out.println(threesumclosest(nums,target));
    }
    static int threesumclosest(int[]nums,int target){
        //sorted the array
        Arrays.sort(nums);
        int resultsum=nums[0]+nums[1]+nums[2];
        int minDifferent=Math.abs(resultsum-target);
        // Now fix the first element and found out the other 2 element
        for(int i=0;i<nums.length-2;i++){
            //Find other two element using two approach
            int left=i+1;
            int right= nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    return target;
                } else if(sum<target) {
                    left++;
                }else{
                    right--;
                }
                int difftotarget=Math.abs(sum-target);
                if(difftotarget<minDifferent){
                    //update the result sum
                    difftotarget=minDifferent;
                    resultsum=sum;

                }
            }
        }
        return resultsum;
    }
}


