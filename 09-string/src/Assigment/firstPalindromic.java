package Assigment;

//https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/?envType=problem-list-v2&envId=two-pointers
//2108. Find First Palindromic String in the Array

public class firstPalindromic {
    static void main(String[] args) {
        String[]words={"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }
    static String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(ispalindromic(words[i])==true){
                return words[i];
            }
        }
        return "";
    }
    //check if its palindromic or not
    static boolean ispalindromic(String s ){
        int left=0;
        int right=s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
