package Assigment;
//https://leetcode.com/problems/reverse-string/description/
//344. Reverse String
public class ReversString {
    static void main(String[] args) {
        char [] s ={'h','e','l','l','o'};
        reverseString(s);
        // Print output like ["o","l","l","e","h"]
        System.out.print("[");
        for (int i = 0; i < s.length; i++) {
            System.out.print("\"" + s[i] + "\"");
            if (i < s.length - 1) System.out.print(","); // add comma between characters
        }
        System.out.println("]");
    }
    static void reverseString(char[] s){
        int start=0;
        int end=s.length-1;

        while(start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
}
