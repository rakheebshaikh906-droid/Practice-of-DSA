package Assigment;

import java.util.*;

public class Subsets {
    static void main(String[] args) {
        Subsets obj = new Subsets();

        int[] nums = {1, 2, 3};

        List<List<Integer>> ans = obj.subsets(nums);

        System.out.println(ans);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < (1 << n); i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    list.add(nums[j]);
                }
            }

            ans.add(list);
        }

        return ans;
    }
}