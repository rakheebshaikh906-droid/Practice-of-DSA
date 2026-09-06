package Assigment;

//https://leetcode.com/problems/shortest-common-supersequence/
//1092. Shortest Common Supersequence

public class ShortestCommonSupersequence {
    static void main(String[] args) {
        String str1="brute";
        String str2="groot";

        System.out.println(shortestCommonSupersequence(str1,str2));

    }
    static String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        int[][] dp = new int[m + 1][n + 1];
        // Base case
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = 0;
        }
        // Fill the table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // Match
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
                // Not match
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        int i=m;
        int j=n;

        String ans="";
        while(i>0 && j>0){
            if(str1.charAt(i - 1) == str2.charAt(j - 1)){
                ans+=str1.charAt(i-1);
                i--;
                j--;
            }else if(dp[i-1][j]>dp[i][j-1]){
                ans+=str1.charAt(i-1);
                i--;
            }else{
                ans+=str2.charAt(j-1);
                j--;
            }
        }

        while(i>0){
            ans+=str1.charAt(i-1);
            i--;
        }

        while(j>0){
            ans+=str2.charAt(j-1);
            j--;
        }
        String reversed=new StringBuilder(ans).reverse().toString();

        return reversed;
    }
}
