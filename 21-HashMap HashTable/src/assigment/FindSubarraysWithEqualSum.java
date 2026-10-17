package assigment;

//https://leetcode.com/problems/find-subarrays-with-equal-sum/description/
//2395. Find Subarrays With Equal Sum

import java.util.HashSet;
import java.util.Set;

public class FindSubarraysWithEqualSum {
    static void main(String[] args) {
        int[]nums={1,2,3,4,5};
        System.out.println(findSubArrays(nums));
    }
    static boolean findSubArrays(int[]nums){
        int i=0;
        int j=1;
        Set<Integer>set=new HashSet<>();

        while(j<nums.length){
            int sum=nums[i]+nums[j];
            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
            i++;
            j++;
        }
        return false;
    }
}
