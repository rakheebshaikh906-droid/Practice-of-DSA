package Assigment;

//https://leetcode.com/problems/smallest-range-i/submissions/1896217273/?envType=problem-list-v2&envId=math
//908. Smallest Range I

public class SmallestRangeI {
    static void main(String[] args) {
        int[]nums={0,10};
        int k=2;
        System.out.println(smallestRange(nums,k));
    }
    static int smallestRange(int[]nums,int k){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i< nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        if(min+k>max-k){  //if min is greater than max value return 0;
            return 0;
        }
        return (max-k)-(min+k);
    }
}
