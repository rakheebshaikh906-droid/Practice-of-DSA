package Assigment;

//https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/description/?envType=problem-list-v2&envId=two-pointers
//1963. Minimum Number of Swaps to Make the String Balanced

import java.util.Stack;
public class MinimumNumberOfSwaps {
    static void main(String[] args) {
        String s="]]][[[";
        System.out.println(minimumSwap(s));
    }
    static int minimumSwap(String s){
        Stack<Character> st = new Stack<>();
        int imbalanceCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                st.push('[');
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    imbalanceCount++;
                }

            }
        }
        return (imbalanceCount+1)/2;
    }
    //more optimal
    public int minSwaps(String s) {
        int balance = 0;
        int imbalance = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                balance++;
            } else {
                if (balance > 0) {
                    balance--;
                } else {
                    imbalance++;
                }
            }
        }
        return (imbalance + 1) / 2;
    }
}
