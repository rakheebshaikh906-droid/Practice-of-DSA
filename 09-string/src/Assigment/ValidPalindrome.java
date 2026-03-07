package Assigment;
//http.leetcode.com/problems/valid-palindrome/description/
// 125.Valid Palindrome
public class ValidPalindrome {
    static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s){
        s = s.toLowerCase(); // convert to lowercase
        // remove all non-alphanumeric characters
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(c);
            }
        }
        String str = cleaned.toString();
        // check palindrome using for loop
        for(int i=0;i<str.length()/2;i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
