package Assigment;

//https://leetcode.com/problems/maximum-prime-difference/
//3115. Maximum Prime Difference

public class MaximumPrimeDifference {
    static void main(String[] args) {
        int[] nums = {4, 2, 9, 5, 3};

        System.out.println(maximumPrimeDifference(nums));
    }

    public static int maximumPrimeDifference(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }

        return Math.abs(min - max);
    }

    private static boolean isPrime(int a) {
        if (a < 2) {
            return false;
        }

        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
    }
}
