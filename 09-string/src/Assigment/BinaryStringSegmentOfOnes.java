package Assigment;

//https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
//1784. Check if Binary String Has at Most One Segment of Ones
public class BinaryStringSegmentOfOnes {
    static void main(String[] args) {
        String s="1001";
        System.out.println(checkOnesSegment(s));
    }
    static boolean checkOnesSegment(String s){
        int n=s.length();
        for(int i=1;i<n;i++){ //we start loop 1 without we check previous element
            if(s.charAt(i-1)=='0' && s.charAt(i)=='1'){
                return false;
            }
        }
        return true;
    }
}
