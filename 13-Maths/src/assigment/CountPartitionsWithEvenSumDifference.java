package Assigment;

//https://leetcode.com/problems/count-partitions-with-even-sum-difference/
//3432. Count Partitions with Even Sum Difference

public class CountPartitionsWithEvenSumDifference {
    static void main(String[] args) {
        int[]nums={10,10,3,7,6};
        System.out.println(countPartitions(nums));
    }
    static int countPartitions(int[] nums) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        int leftsum=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            leftsum+=nums[i];
            int rightsum=totalsum-leftsum;

            if((rightsum%2)==(leftsum%2)){
                count+=1;
            }
        }
        return count;
    }
}
