package Assigment;
//https://leetcode.com/problems/count-number-of-homogenous-substrings/description/
//1759. Count Number of Homogenous Substrings
public class CountHomogenousSubstring {
    static void main(String[] args) {
        String s = "abbcccaa";//expected output:13
        System.out.println(countHomogenous(s));
    }
    static int countHomogenous(String s){
        int result=0; // stores total count of homogenous substrings
        int length=0; // length of current continuous block of same characters
        int n=s.length();// total length of string
        int MOD = 1000000007;// This is a large prime number (10^9 + 7) commonly used in programming contests
        // It helps keep numbers within the range of int (to avoid overflow)
        // because result values can become extremely large for big input strings.
        for(int i=0;i<n;i++){
            // if current char is same as previous char → extend the current block
            if(i>0 && s.charAt(i)==s.charAt(i-1)){
                length+=1;
            }else{
                // otherwise, start a new block
                length=1;
            }
            // add the current block length to the result
            // reason: each new same-char continuation adds `length` new substrings
            // Example: "aaa" → a, aa, aaa
            result=(result+length)%MOD;
            // We add the current block's contribution (length) to the total result
            // and then take modulo MOD to ensure the value stays small and safe
            // Example:
            //   Without %MOD, result could exceed int limit (overflow).
            //   With %MOD, we keep result always in [0, 10^9+7), i.e., safe and manageable.
            //   The modulo does not change the final answer correctness — just keeps it bounded.
        }
        return result;
    }
}
