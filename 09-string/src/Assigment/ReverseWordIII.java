package Assigment;

import java.util.Arrays;
//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
//557. Reverse Words in a String III
public class ReverseWordIII {
    static void main(String[] args) {
        String s= "Let's take LeetCode contest";
        System.out.println(reverseword(s));
    }
    static String reverseword(String s){
        char[]arr=s.toCharArray();
        int start=0;
        for (int end = 0; end <= arr.length; end++) {
            // when we reach a space or end of string, reverse the word
            if (end == arr.length || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1; // move to next word
            }
        }
        return new String(arr);
    }
    static void reverse(char[]arr,int start,int end){
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
