package assignment;

import java.util.Arrays;

//https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/description/?envType=problem-list-v2&envId=two-pointers
//3194. Minimum Average of Smallest and Largest Elements

public class MinimumAverageOfSmallestAndLargestElements {
    static void main(String[] args) {
        int[]nums={7,8,3,4,15,13,4,1};
        System.out.println(minimumAverage(nums));
    }
    static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        double minAvg=Double.MAX_VALUE;
        for(int i=0;i<n/2;i++){
                double average= (nums[i] + nums[n - i - 1]) /2.0;
                minAvg=Math.min(minAvg,average);

        }
        return minAvg;

    }
}
