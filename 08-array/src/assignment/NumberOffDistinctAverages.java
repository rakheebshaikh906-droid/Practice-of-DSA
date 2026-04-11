package assignment;

//https://leetcode.com/problems/number-of-distinct-averages/description/?envType=problem-list-v2&envId=two-pointers
//2465. Number of Distinct Averages

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOffDistinctAverages {
    static void main(String[] args) {
        int[]nums={4,1,4,0,3,5};
        System.out.println(distinctAverages(nums));
    }
    static int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double>set=new HashSet<>();
        int left=0;
        int right=nums.length-1;
        while(left<right){
            double ans = (nums[left] + nums[right]) / 2.0;
            set.add(ans);
            left++;
            right--;
        }
        return set.size();

    }
}
