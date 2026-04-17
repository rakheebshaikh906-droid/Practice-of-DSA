package Assigment;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
//17. Letter Combinations of a Phone Number
public class PhoneNumber {
    static void main(String[] args) {
        String digits="23";
        System.out.println(letterCombinations(digits));

    }
    static List<String> letterCombinations(String digits){
        if (digits.isEmpty()) return new ArrayList<>();
        return padRet("", digits);
    }
    private static  ArrayList<String> padRet(String p, String up) {
        // base case
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        int digit = up.charAt(0) - '0';

        // mapping correct range of characters
        int start = getStartIndex(digit);
        int end = getEndIndex(digit);

        for (int i = start; i < end; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(padRet(p + ch, up.substring(1)));
        }

        return ans;
    }

    // helper for start index
     static int getStartIndex(int digit) {
        switch (digit) {
            case 2: return 0;   // abc
            case 3: return 3;   // def
            case 4: return 6;   // ghi
            case 5: return 9;   // jkl
            case 6: return 12;  // mno
            case 7: return 15;  // pqrs (4 chars)
            case 8: return 19;  // tuv
            case 9: return 22;  // wxyz (4 chars)
        }
        return 0;
    }

    // helper for end index
     static int getEndIndex(int digit) {
        switch (digit) {
            case 2: return 3;
            case 3: return 6;
            case 4: return 9;
            case 5: return 12;
            case 6: return 15;
            case 7: return 19;  // +4 chars
            case 8: return 22;
            case 9: return 26;  // +4 chars
        }
        return 0;
    }
}
