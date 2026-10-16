package Assigment;

//424. Longest Repeating Character Replacement
//https://leetcode.com/problems/longest-repeating-character-replacement/description/

public class LongestRepeatingCharacterReplacement {
    static void main(String[] args) {
        String s ="AAABABC";
        int k=2;

        System.out.println(characterReplacement(s,k));
    }
    public static int characterReplacement(String s, int k) {

        int l = 0, r = 0, maxLen = 0, maxFreq = 0;
        int[] hash = new int[26];

        while (r < s.length()) {
            hash[s.charAt(r) - 'A']++;

            maxFreq = Math.max(maxFreq, hash[s.charAt(r) - 'A']);

            while ((r - l + 1) - maxFreq > k) {
                hash[s.charAt(l) - 'A']--;

                maxFreq = 0;
                for (int i = 0; i < 26; i++) {
                    maxFreq = Math.max(maxFreq, hash[i]);
                }

                l++;
            }

            if ((r - l + 1) - maxFreq <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }

            r++;
        }

        return maxLen;

    }
}
