package assigment;

//https://leetcode.com/problems/find-the-xor-of-numbers-which-appear-twice/description/
//3158. Find the XOR of Numbers Which Appear Twice

import java.util.HashMap;

public class DuplicateNumbersXOR {
    static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3};
        System.out.println(duplicateNumbersXOR(nums));
    }
    public static int duplicateNumbersXOR(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int num : freq.keySet()) {
            if (freq.get(num) == 2) {
                ans ^= num;
            }
        }
        return ans;
    }
}