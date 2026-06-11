package Assigment;

//https://leetcode.com/problems/permutation-difference-between-two-strings/description/
//3146. Permutation Difference between Two Strings

public class PermutationDifferenceBetweenTwoStrings {
    static void main(String[] args) {
        String s = "abcde";
        String t = "edbac";

        System.out.println(findPermutationDifference(s,t));
    }
    static int findPermutationDifference(String s, String t) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    sum+=Math.abs(i-j);
                }
            }
        }
        return sum;
    }
}
