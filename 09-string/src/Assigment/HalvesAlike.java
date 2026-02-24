package Assigment;

//https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
//1704. Determine if String Halves Are Alike
import java.util.Set;

public class HalvesAlike {
    static void main(String[] args) {
        String s = "book";
        System.out.println(HalvesAreAlike(s));
    }
    static boolean HalvesAreAlike(String s){
        char[] ch=s.toCharArray();
        int left=0;
        int right=ch.length-1;
        int lcount=0;
        int rcount=0;
        //create a set of vowels both lower cast and upper cast
        Set<Character> vowels=Set.of ('a','e','i','o','u','A','E','I','O','U');
        //use two pointer left-> start  right-> end
        while(left<right){
            if(vowels.contains(ch[left])) lcount++;
            if(vowels.contains(ch[right])) rcount++;
            left++;
            right--;
        }
        return lcount==rcount;
    }
}
