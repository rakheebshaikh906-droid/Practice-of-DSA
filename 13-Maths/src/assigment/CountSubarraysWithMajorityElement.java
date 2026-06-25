package Assigment;

//3737. Count Subarrays With Majority Element I
/* https://leetcode.com/problems/count-subarrays-with-majority-element-i/solutions/
8357369/3737-count-subarrays-with-majority-eleme-4g4u */

public class CountSubarraysWithMajorityElement {
    static void main(String[] args) {
        int[]nums={1,1,1,1};
        int target=1;
        System.out.println(countSub(nums,target));
    }
    static int countSub(int[]nums,int target){
        int count=0;

        for(int i=0;i<nums.length;i++){
            int freq=0;
            for(int j=i;j< nums.length;j++){
                if(nums[j]==target){
                    freq++;
                }
                int l=j-i+1;
                if(freq*2>l){
                    count++;
                }
            }
        }
        return count;
    }
}
