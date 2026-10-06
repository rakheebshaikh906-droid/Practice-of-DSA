package assignment;

//https://leetcode.com/problems/number-of-subarrays-that-match-a-pattern-i/
//3034. Number of Subarrays That Match a Pattern I

public class NumberOfSubarraysThatMatchAPattern1 {
    static void main(String[] args) {
        int[]nums={1,4,4,1,3,5,5,3};
        int[]pattern={1,0,-1};

        System.out.println(countMatchingSubarrays(nums,pattern));
    }
    public static int countMatchingSubarrays(int[] nums, int[] pattern) {
        int count=0;
        for(int i=0;i<= nums.length - pattern.length - 1;i++){
            int match=0;
            for(int k=0;k<pattern.length;k++){
                if(pattern[k] == 1 && nums[i+k+1] > nums[i+k]) {
                    match++;
                }
                else if(pattern[k] == 0 && nums[i+k+1] == nums[i+k]) {
                    match++;
                }
                else if(pattern[k] == -1 && nums[i+k+1] < nums[i+k]) {
                    match++;
                }
            }
            if(match==pattern.length){
                count++;
            }
        }
        return count;
    }
}
