package Assigment;

//https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/?envType=daily-question&envId=2026-09-28
//1614. Maximum Nesting Depth of the Parentheses

public class MaximumNestingDepthOfTheParentheses {
    static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth("Max depth is:"+s));
    }
    static int maxDepth(String s) {
        int depth = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                depth++;
                max = Math.max(max, depth);
            }
            else if (s.charAt(i) == ')') {
                depth--;
            }
        }

        return max;
    }
}
