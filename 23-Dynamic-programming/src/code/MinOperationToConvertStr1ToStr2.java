package code;

//Q.Min Operation (deletion/insertion)to Convert str1 to str2
import java.util.Arrays;

public class MinOperationToConvertStr1ToStr2 {
    static void main(String[] args) {
        String a="abcd";
        String b="anc";
        System.out.println(minOperations(a,b));
    }
    static int minOperations(String a, String b) {

        int m = a.length();
        int n = b.length();

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        int lcs = f(m - 1, n - 1, a, b, dp);

        return n+m-2*lcs;


    }

    static int f(int i, int j, String a, String b, int[][] dp) {

        if (i < 0 || j < 0) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (a.charAt(i) == b.charAt(j)) {
            return dp[i][j] = 1 + f(i - 1, j - 1, a, b, dp);
        }

        return dp[i][j] = Math.max(
                f(i - 1, j, a, b, dp),
                f(i, j - 1, a, b, dp)
        );
    }
}
