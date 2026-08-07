package Assigment;

//https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/description/
//1541. Minimum Insertions to Balance a Parentheses String

public class MinimumInsertionToBalanceValidParenthesis {
    static void main(String[] args) {
        String s="(()))";
        System.out.println(minInsertions(s));
    }
    static int minInsertions(String s) {
        int insertions = 0;
        int need = 0;   // number of ')' needed

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                // '(' needs two ')'
                if (need % 2 == 1) {
                    insertions++; // insert one ')'
                    need--;       // fix odd need
                }
                need += 2;
            } else { // ch == ')'
                need--;
                if (need < 0) {
                    insertions++; // insert '('
                    need = 1;
                }
            }
        }
        return insertions + need;
    }
}
