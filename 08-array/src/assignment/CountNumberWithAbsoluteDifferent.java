package assignment;

//https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/?envType=problem-list-v2&envId=array
//2006. Count Number of Pairs With Absolute Difference K
public class CountNumberWithAbsoluteDifferent {
    static void main(String[] args) {
        int[]nums={3,2,1,5,4};
        int k=2;
        System.out.println(countKDifference(nums,k));
    }
    static int countKDifference(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    count+=1;
                }
            }
        }
        return count;
    }
}
