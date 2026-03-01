package Assigment;

//https://leetcode.com/problems/reverse-prefix-of-word/description/
//2000. Reverse Prefix of Word
public class ReversePrefix {
    static void main(String[] args) {
        String word="abcdefd";
        char ch='d';
        System.out.println(reversePrefix(word,ch));
    }
    static String reversePrefix(String word, char ch){
        // Step 1: find the index of the first occurrence of ch
        int idx = word.indexOf(ch);

        // If ch is not present, return word as it is
        if (idx == -1) return word;

        // Convert string to char array (we will use two-pointer swapping)
        char[] arr = word.toCharArray();

        // Step 2: reverse from 0 to idx using two pointers
        int start = 0, end = idx;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Step 3: convert back to string
        return new String(arr);
    }
}
