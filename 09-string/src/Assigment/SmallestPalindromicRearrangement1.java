package Assigment;

import java.util.Arrays;

//https://leetcode.com/problems/smallest-palindromic-rearrangement-i/description/?envType=daily-question&envId=2026-07-28
//3517. Smallest Palindromic Rearrangement I

public class SmallestPalindromicRearrangement1 {
    static void main(String[] args) {
        String s = "daccad";
        System.out.println(SmallestPalindrome(s));
    }
    static String SmallestPalindrome(String s){
        int n=s.length();
        int mid = n/2;

        char[]arr=s.toCharArray();

        Arrays.sort(arr,0,mid);

        for(int i=0;i<mid;i++){
            arr[n-1-i]=arr[i];
        }
        return new String(arr);
    }
}
