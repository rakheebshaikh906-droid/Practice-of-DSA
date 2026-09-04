package Assigment;

//https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/submissions/
//1312. Minimum Insertion Steps to Make a String Palindrome

public class MinimumInsertionStepsToMakeStringPalindrome {
    static void main(String[] args) {
        String s="leetcode";
        System.out.println(minInsertions(s));

    }
    static  int minInsertions(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return Math.abs(lcs(s,reversed)-s.length());

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
