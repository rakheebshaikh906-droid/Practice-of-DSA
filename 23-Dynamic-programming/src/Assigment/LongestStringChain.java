package Assigment;

//https://leetcode.com/problems/longest-string-chain/description/
//1048. Longest String Chain

import java.util.Arrays;
import java.util.Comparator;

public class LongestStringChain {
    static void main(String[] args) {
        String [] words={"xbc","pcxbcf","xb","cxbc","pcxbc"};
        System.out.println(longestChain(words));
    }
    static int longestChain(String[]words){
        Arrays.sort(words, Comparator.comparingInt(String::length));
        int n=words.length;
        int[]dp=new int[n];
        Arrays.fill(dp, 1);
        int maxi=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(compare(words[i],words[j])){
                    dp[i]=Math.max(dp[i],1+dp[j]);
                }
            }
            maxi=Math.max(maxi,dp[i]);
        }
        return maxi;
    }
    private static boolean compare(String s1,String s2){
        if(s1.length()!=s2.length()+1) return false;
        int first=0;
        int second=0;
        while(first<s1.length()){
            if(second<s2.length() && s1.charAt(first)==s2.charAt(second)){
                first++;
                second++;
            }else{
                first++;
            }
        }
        return first == s1.length() && second == s2.length();
    }
}
