package Assigment;
//https://leetcode.com/problems/longest-common-prefix/
//14. Longest Common Prefix

import java.util.Arrays;
public class LongestCommonPrefix {
    static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    static String longestCommonPrefix(String[] strs){
        // we create a new string builder for storing the result
        StringBuilder result = new StringBuilder();
        //sort the string
        Arrays.sort(strs);
        //get a first and last string
        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();
        //comparing them
        for(int i=0;i< first.length && i< last.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            result.append(first[i]);//we also write like this result.append(last[i])
        }
        return result.toString();
    }
}
