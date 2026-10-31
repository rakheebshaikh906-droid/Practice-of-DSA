package assigment;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/single-number-iii/
//260. Single Number III

public class SingleNumber {
    static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};
        System.out.println(Arrays.toString(singleNumber(nums)));
    }
    public static int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        int index = 0;

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int num : freq.keySet()) {
            if (freq.get(num) == 1) {
                ans[index++] = num;
            }
        }
        return ans;
    }
}
