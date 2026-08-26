package assigment;

//https://leetcode.com/problems/divide-array-into-equal-pairs/description/?envType=problem-list-v2&envId=hash-table
//2206. Divide Array Into Equal Pairs

import java.util.HashMap;
import java.util.Map;

public class DivideArrayIntoEqualPairs {
    static void main(String[] args) {
        int[]nums={3,2,3,2,2,2};
        System.out.println(divideArray(nums));
    }
    static boolean divideArray(int[]nums){
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int count : map.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
