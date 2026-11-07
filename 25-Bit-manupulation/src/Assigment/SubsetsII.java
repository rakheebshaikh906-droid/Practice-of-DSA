package Assigment;

import java.util.*;

public class SubsetsII {
    static void main(String[] args) {
        SubsetsII obj = new SubsetsII();

        int[] nums = {1, 2, 2};

        List<List<Integer>> ans = obj.subsetsWithDup(nums);

        System.out.println(ans);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();

        Arrays.sort(nums);
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

        return new ArrayList<>(ans);
    }
}