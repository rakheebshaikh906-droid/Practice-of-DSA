package Assigment;

//https://leetcode.com/problems/longest-palindromic-subsequence/description/
//516. Longest Palindromic Subsequence

public class LongestPalindromicSubsequence {
    static void main(String[] args) {

    }
    static int longestPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return lcs(s,reversed);

    }
    static int lcs(String a,String b){
        int m = a.length();
        int n = b.length();

        int[] prev = new int[n + 1];
        int[] curr = new int[n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // Match
                if (a.charAt(i - 1) == b.charAt(j - 1)) {

                    curr[j] = 1 + prev[j - 1];

                }
                // Not match
                else {
                    curr[j] = Math.max(prev[j], curr[j - 1]);
                }
            }
            // Swap prev and curr
            int[] temp = prev;
            prev = curr;
            curr = temp;
        }
        return prev[n];
    }
}
