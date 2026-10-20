package Assigment;

//https://leetcode.com/problems/subarrays-with-k-different-integers/description/
//992. Subarrays with K Different Integers

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithKDifferentIntegers {
    static void main(String[] args) {
        int[]nums={1,2,1,2,3};
        int k=2;
        System.out.println(subArrayWithK(nums,k));
    }
    static int subArrayWithK(int[]nums,int k){
        return solve(nums,k)-solve(nums,k-1);
    }
    static int solve(int[]nums,int k){
        if(k<0){
            return 0;
        }
        int l=0;
        int r=0;
        int ans=0;
        Map<Integer, Integer> map = new HashMap<>();
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);

            if(map.size()>k){
                while(map.size()>k){
                    map.put(nums[l], map.get(nums[l]) - 1);
                    if(map.get(nums[l])==0){
                        map.remove(nums[l]);
                    }
                    l++;
                }
            }
            if(map.size()<=k){
                ans+=r-l+1;
            }
            r++;
        }
        return ans;
    }
}
