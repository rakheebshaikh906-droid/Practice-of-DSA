package Assigment;
//https://leetcode.com/problems/merge-strings-alternately/description/
//1768. Merge Strings Alternately
public class MergeString {
    static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";//expected output
        System.out.println(mergeAlternately(word1,word2));

    }
    static String mergeAlternately(String word1, String word2){
        StringBuilder sb = new StringBuilder();
        int n1=word1.length();
        int n2= word2.length();
        int i=0;
        while(i<n1||i<n2){
            if(i<n1){
                sb.append(word1.charAt(i));
            }
            if(i<n2){
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
