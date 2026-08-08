package Assigment;

//https://leetcode.com/problems/remove-outermost-parentheses/
//1021. Remove Outermost Parentheses

import java.util.Stack;

public class RemoveOuterMostParenthesis {
    static void main(String[] args) {
        String s="(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
    static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (!stack.isEmpty()) {
                    ans.append(ch);   // inner '('
                }
                stack.push(ch);
            } else { // ch == ')'
                stack.pop();
                if (!stack.isEmpty()) {
                    ans.append(ch);   // inner ')'
                }
            }
        }
        return ans.toString();
    }
}
