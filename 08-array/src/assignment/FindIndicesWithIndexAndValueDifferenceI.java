package assignment;

import java.util.Arrays;

//https://leetcode.com/problems/find-indices-with-index-and-value-difference-i/description/?envType=problem-list-v2&envId=two-pointers
//2903. Find Indices With Index and Value Difference I

public class FindIndicesWithIndexAndValueDifferenceI {
    static void main(String[] args) {
        int[]nums={5,1,4,1};
        int indexDifference = 2, valueDifference = 4;
        System.out.println(Arrays.toString(findIndices(nums,indexDifference,valueDifference)));
    }
    static int[] findIndices(int[] nums, int indexDifference, int valueDifference){
        int n=nums.length;
        for(int i=0;i<n-indexDifference;i++){
            for(int j=indexDifference+i;j<n;j++){
                if(Math.abs(i-j)>=indexDifference && Math.abs(nums[i]-nums[j])>=valueDifference){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

    }
}
