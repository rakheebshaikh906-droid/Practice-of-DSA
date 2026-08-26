package assigment;

//https://leetcode.com/problems/first-letter-to-appear-twice/?envType=problem-list-v2&envId=counting
//2351. First Letter to Appear Twice

import java.util.HashSet;
import java.util.Set;

public class FirstLetterToAppearTwice {
    static void main(String[] args) {
        String s="abccbaacz";
    }
    static char repeatedCharacter(String s) {
        Set<Character> seen = new HashSet<>();

        for(char c : s.toCharArray()){
            if(seen.contains(c)){
                return c;
            }
            seen.add(c);
        }
        return ' ';
    }
}
