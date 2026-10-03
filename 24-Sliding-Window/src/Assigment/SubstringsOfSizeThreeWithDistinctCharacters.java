package Assigment;

//https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
//1876. Substrings of Size Three with Distinct Characters

public class SubstringsOfSizeThreeWithDistinctCharacters {
    static void main(String[] args) {
        String s ="abdchdcfe";
        System.out.println(countGoodSubstrings(s));
    }
    public static int countGoodSubstrings(String s) {
        int ans=0;
        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i+1)!=s.charAt(i+2) && s.charAt(i)!=s.charAt(i+2)){
                ans++;
            }
        }
        return ans;
    }
}
