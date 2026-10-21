package Assigment;

//https://leetcode.com/problems/minimum-window-substring/description/
//76. Minimum Window Substring

public class MinimumWindowSubstring {
    static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t = "ABC";

        System.out.println(minWindow(s,t));

    }
    public static String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();

        if (n < m) {
            return "";
        }

        int[] hash = new int[128];
        for (int i = 0; i < m; i++) {
            hash[t.charAt(i)]++;
        }

        int l = 0;
        int r = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;
        int cnt = 0;

        while (r < n) {
            if (hash[s.charAt(r)] > 0) {
                cnt++;
            }
            hash[s.charAt(r)]--;
            while (cnt == m) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    startIndex = l;
                }

                hash[s.charAt(l)]++;
                if (hash[s.charAt(l)] > 0) {
                    cnt--;
                }
                l++;
            }
            r++;
        }
        if (startIndex == -1) {
            return "";
        }
        return s.substring(startIndex, startIndex + minLen);
    }
}
