package Assigment;

//https://leetcode.com/problems/valid-palindrome-ii/
//680. Valid Palindrome II

public class ValidPalindrome2 {
    static void main(String[] args) {
        String s="abca";
        System.out.println(validpalindrome(s));
    }
    static boolean validpalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return isPalindrome(s, left + 1, right) ||
                        isPalindrome(s, left, right - 1);
            }
        }
        return true;
    }

    static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
