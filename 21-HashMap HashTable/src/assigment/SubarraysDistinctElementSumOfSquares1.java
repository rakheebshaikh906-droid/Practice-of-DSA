package assigment;

//https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/description/
//2913. Subarrays Distinct Element Sum of Squares I

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubarraysDistinctElementSumOfSquares1 {
    static void main(String[] args) {
        List<Integer>nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(sumCounts(nums));

    }
    static int sumCounts(List<Integer>nums) {
        int ans=0;
        for(int i=0;i< nums.size();i++){
            Set<Integer>set=new HashSet<>();
            for(int j=i;j<nums.size();j++){
                set.add(nums.get(j));
                ans+= set.size()* set.size();
            }
        }
        return ans;

    }
}
