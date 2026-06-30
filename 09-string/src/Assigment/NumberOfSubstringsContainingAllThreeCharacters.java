package Assigment;

//https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/
//1358. Number of Substrings Containing All Three Characters

public class NumberOfSubstringsContainingAllThreeCharacters {
    static void main(String[] args) {
        String s = "abcabc";
        System.out.println(numberOfSubstrings(s));
    }
    static int numberOfSubstrings(String s) {
        int[] freq = new int[3];

        int left = 0;
        int count = 0;
        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'a']++;
            while (freq[0] > 0 &&
                    freq[1] > 0 &&
                    freq[2] > 0) {
                count += s.length() - right;
                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return count;
    }
}
