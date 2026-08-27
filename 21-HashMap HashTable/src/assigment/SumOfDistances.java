package assigment;

//https://leetcode.com/problems/sum-of-distances/description/?envType=daily-question&envId=2026-04-23
//2615. Sum of Distances
//2121. Intervals Between Identical Elements

import java.util.*;

public class SumOfDistances {
    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 1, 2};

        long[] result = distance(nums);

        System.out.println("Output:");
        for (long val : result) {
            System.out.print(val + " ");
        }
    }

    public static long[] distance(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];

        Map<Integer, List<Integer>> map = new HashMap<>();

        // Step 1: Group indices by value
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        // Step 2: Process each group
        for (List<Integer> list : map.values()) {
            int size = list.size();

            long[] prefix = new long[size];
            prefix[0] = list.get(0);

            for (int i = 1; i < size; i++) {
                prefix[i] = prefix[i - 1] + list.get(i);
            }

            for (int k = 0; k < size; k++) {
                int idx = list.get(k);

                // LEFT contribution
                long left = (long) idx * k - (k > 0 ? prefix[k - 1] : 0);

                // RIGHT contribution
                long right = (prefix[size - 1] - prefix[k])
                        - (long) idx * (size - k - 1);

                ans[idx] = left + right;
            }
        }

        return ans;
    }
}