package Assigment;

//https://leetcode.com/problems/count-commas-in-range-ii/description/?source=submission-noac
//3871. Count Commas in Range II

public class CountCommasInRange2 {
    static void main(String[] args) {
        long n=1000000;
        System.out.println(countCommas(n));
    }
    public static long countCommas(long n) {
        long ans = 0;
        if (n < 1000) {
            return 0;
        }
        if (n >= 1000) {
            long end = Math.min(n, 999999L);
            ans += (end - 1000 + 1);
        }
        if (n >= 1000000) {
            long end = Math.min(n, 999999999L);
            ans += (end - 1000000 + 1) * 2;
        }
        if (n >= 1000000000) {
            long end = Math.min(n, 999999999999L);
            ans += (end - 1000000000 + 1) * 3;
        }
        if (n >= 1000000000000L) {
            long end = Math.min(n, 999999999999999L);
            ans += (end - 1000000000000L + 1) * 4;
        }
        if (n >= 1000000000000000L) {
            ans += (n - 1000000000000000L + 1) * 5;
        }

        return ans;
    }
}
