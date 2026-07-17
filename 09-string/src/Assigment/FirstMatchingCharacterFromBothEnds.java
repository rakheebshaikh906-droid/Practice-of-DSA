package Assigment;

//https://leetcode.com/problems/first-matching-character-from-both-ends/description/?envType=problem-list-v2&envId=two-pointers
//3884. First Matching Character From Both Ends

public class FirstMatchingCharacterFromBothEnds {
    static void main(String[] args) {
        String s = "abcacbd";
        System.out.println(firstMatchingIndex(s));
    }
    static int firstMatchingIndex(String s) {
        int n=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==s.charAt(n-i-1)){
                return i;
            }
        }
        return -1;
    }
}
