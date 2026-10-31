package assigment;

import java.util.*;

public class ThirdMaximum {
    static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() < 3) {
            return set.last();
        }
        return set.descendingSet().stream().skip(2).findFirst().get();
    }
}