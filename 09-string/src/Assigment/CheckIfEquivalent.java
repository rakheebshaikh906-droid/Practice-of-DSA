package Assigment;
//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
//1662. Check If Two String Arrays are Equivalent
public class CheckIfEquivalent {
    static void main(String[] args) {
        String[]word1={"ab","c"};
        String[]word2={"a","bc"};
        System.out.println(arraystringareequal(word1,word2));
    }
    static boolean arraystringareequal(String[]word1,String[]word2){
        // Join all strings in word1 into one complete string
        // Example: {"ab", "c"} → "abc"
        String s1=String.join("",word1);

        // Join all strings in word2 into one complete string
        // Example: {"a", "bc"} → "abc"
        String s2=String.join("",word2);

        // Compare the two final strings
        // returns true if they are equal, false otherwise
        return s1.equals(s2);
    }
}
