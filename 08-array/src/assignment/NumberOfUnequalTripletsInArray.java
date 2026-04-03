package assignment;

//https://leetcode.com/problems/number-of-unequal-triplets-in-array/description/?envType=problem-list-v2&envId=array
//2475. Number of Unequal Triplets in Array

public class NumberOfUnequalTripletsInArray {
    static void main(String[] args) {
        int[]nums={4,4,2,4,3};
        System.out.println(uniqueTriplet(nums));
    }
    static int uniqueTriplet(int[]nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]!=nums[j] && nums[i]!=nums[k] && nums[j]!=nums[k]){
                        count++;

                    }
                }
            }
        }
        return count;
    }
}
