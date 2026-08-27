package assigment;

//https://leetcode.com/problems/unique-number-of-occurrences/description/?envType=problem-list-v2&envId=hash-table
//1207. Unique Number of Occurrences

import java.util.*;

public class uniqueOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(unique(arr));

    }

    static boolean unique(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();

        for (int count : map.values()) {
            if (set.contains(count)) {
                return false;
            }
            set.add(count);
        }

        return true;
    }
}