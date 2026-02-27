package Assigment;

//https://leetcode.com/problems/maximum-substrings-with-distinct-start/submissions/1890754236/?envType=problem-list-v2&envId=string
//3760. Maximum Substrings With Distinct Start

public class MaximumSubstringWithDistinctStart {
    static void main(String[] args) {
        String s="abab";
        System.out.println(maxDistinct(s));
    }
    static int maxDistinct(String s){
        boolean[] seen = new boolean[256];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!seen[ch]) {
                seen[ch] = true;
                count++;
            }
        }
        return count;
    }
}
