package Assigment;

//https://leetcode.com/problems/is-subsequence/description/?envType=problem-list-v2&envId=two-pointers
//392. Is Subsequence
public class isSubsequence {
    static void main(String[] args) {
        String s="abc";
        String t="ahbgdc";
        System.out.println(isSubSequence(s,t));
    }

    static boolean isSubSequence(String s,String t){
        int i=0;
        int j=0;

        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();
    }
}
