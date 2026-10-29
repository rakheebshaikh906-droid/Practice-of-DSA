package Assigment;

//https://leetcode.com/problems/minimize-string-length/
//2716. Minimize String Length

import java.util.HashSet;
import java.util.Set;

public class MinimizeStringLength {
    static void main(String[] args) {
        String s = "aaabc";
        System.out.println(minimizedStringLength(s));
    }

    public static int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        return set.size();
    }
}
