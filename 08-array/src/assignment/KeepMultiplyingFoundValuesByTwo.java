package assignment;

//https://leetcode.com/problems/keep-multiplying-found-values-by-two/description/
//2154. Keep Multiplying Found Values by Two

import java.util.HashSet;
import java.util.Set;

public class KeepMultiplyingFoundValuesByTwo {
    static void main(String[] args) {
        int[]nums={5,3,6,1,12};
        int original=3;
        System.out.println(findFinalValue(nums,original));

    }
    static int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        while(set.contains(original)){
            int ans = original * 2;
            original = ans;
        }
        return original;
    }
}
