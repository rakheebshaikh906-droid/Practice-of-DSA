package Assigment;

//https://leetcode.com/problems/strictly-palindromic-number/?envType=problem-list-v2&envId=math
//2396. Strictly Palindromic Number
// According to the problem, a number n is "strictly palindromic"
// if for every base b from 2 to n-2, the representation of n in base b is a palindrome.
// BUT mathematically, no integer n >= 4 can satisfy this condition.
// For base (n-2), the representation of n is always "12", which is not a palindrome.
// Therefore, the answer for all possible n is always false.
public class StrictlyPalindrome {
    static void main(String[] args) {
        int n=9;
        System.out.println(isStrictlyPalindromic(n));
    }
    // This method always returns false because
    // no number can be strictly palindromic as per mathematical proof.
    static boolean isStrictlyPalindromic(int n){
        return false;
    }
}
