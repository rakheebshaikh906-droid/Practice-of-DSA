package Assigment;

//https://leetcode.com/problems/valid-parentheses/description/
//20. Valid Parentheses

import java.util.Stack;
public class ValidParenthesis {
    static void main(String[] args) {
        String s="()[]{}";
        System.out.println(isValid(s));
    }
    static boolean isValid(String s){
        Stack<Character>stack=new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch=='('|| ch=='{'||ch=='['){
                stack.push(ch);
            }else{
                if(ch==')'){
                    if(stack.isEmpty()||stack.pop()!='('){
                        return false;
                    }
                }
                if(ch=='}'){
                    if(stack.isEmpty()||stack.pop()!='{'){
                        return false;
                    }
                }
                if(ch==']'){
                    if(stack.isEmpty()||stack.pop()!='['){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
