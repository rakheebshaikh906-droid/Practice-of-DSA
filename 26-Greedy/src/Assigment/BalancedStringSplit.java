package Assigment;

//https://leetcode.com/problems/split-a-string-in-balanced-strings/description/?envType=problem-list-v2&envId=greedy
//1221. Split a String in Balanced Strings

public class BalancedStringSplit {
    static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
    public static int balancedStringSplit(String s) {
        int ans = 0;
        int balance = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                balance++;
            } else {
                balance--;
            }
            if (balance == 0) {
                ans++;
            }
        }
        return ans;
    }
}
