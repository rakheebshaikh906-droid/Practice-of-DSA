package assignment;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/minimum-distance-between-three-equal-elements-ii/description/?envType=daily-question&envId=2026-04-11
//3741. Minimum Distance Between Three Equal Elements II
//both are same
//3740. Minimum Distance Between Three Equal Elements I
public class MinimumDistanceBetweenThreeEqualElement {
    static void main(String[] args) {
        int[]nums={1,2,1,1,3};
        System.out.println(minimumDistance(nums));
    }
    static int minimumDistance(int[]nums){
        int n = nums.length;
        if (n <= 2) {
            return -1;
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    for (int k = j + 1; k < n; k++) {
                        if (nums[j] == nums[k]) {
                            int dist = k - i;   // ✔ correct formula
                            ans = Math.min(ans, dist);  // ✔ take minimum
                        }
                    }
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    //optimize
    static int minimumDistance2(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];

            if (!map.containsKey(val)) {
                map.put(val, new int[]{-1, -1});
            }

            int[] arr = map.get(val);

            if (arr[0] != -1 && arr[1] != -1) {
                ans = Math.min(ans, 2 * (i - arr[0]));
            }

            // shift indices
            arr[0] = arr[1];
            arr[1] = i;
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
