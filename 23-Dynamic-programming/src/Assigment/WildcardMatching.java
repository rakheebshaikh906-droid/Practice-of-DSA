package Assigment;

//https://leetcode.com/problems/wildcard-matching/
//44. Wildcard Matching

public class WildcardMatching {
    static void main(String[] args) {
        String s="cb", p="?a";
        System.out.println(isMatch(s,p));

    }
    public static boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        Boolean[][] dp = new Boolean[n][m];
        return solve(n - 1, m - 1, s, p, dp);
    }

    private static boolean solve(int i, int j, String s, String p, Boolean[][] dp) {
        if (i < 0 && j < 0) return true;
        if (j < 0) return false;
        if (i < 0) {
            for (int k = 0; k <= j; k++) {
                if (p.charAt(k) != '*') return false;
            }
            return true;
        }

        if (dp[i][j] != null) return dp[i][j];

        boolean ans;
        char pc = p.charAt(j);
        if (pc == s.charAt(i) || pc == '?') {
            ans = solve(i - 1, j - 1, s, p, dp);
        } else if (pc == '*') {
            ans = solve(i - 1, j, s, p, dp) || solve(i, j - 1, s, p, dp);
        } else {
            ans = false;
        }

        return dp[i][j] = ans;
    }
}
