package assigment;

//https://leetcode.com/problems/majority-element-ii/
//229. Majority Element II

import java.util.*;
public class MajorityElement2 {
    static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        int n=nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int check=n/3;
        for (int num : freq.keySet()) {
            if (freq.get(num) > check) {
                ans.add(num);
            }
        }
        return ans;
    }
}