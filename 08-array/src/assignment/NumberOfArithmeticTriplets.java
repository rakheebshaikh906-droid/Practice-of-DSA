package assignment;

//https://leetcode.com/problems/number-of-arithmetic-triplets/?envType=problem-list-v2&envId=two-pointers
//2367. Number of Arithmetic Triplets

import java.util.HashSet;
import java.util.Set;

public class NumberOfArithmeticTriplets {
    static void main(String[] args) {
        int[]nums={0,1,4,6,7,10};
        int diff=3;
        System.out.println(arithmeticTriplets(nums,diff));
    }
    static int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        Set<Integer>set=new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        for(int i : nums){
            if(set.contains(i+diff) && set.contains(i+2*diff)){
                count++;
            }
        }
        return count;
    }
}
