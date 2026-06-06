package Assigment;

//leetcode.com/problems/minimum-number-of-flips-to-reverse-binary-string/submissions/1897136601/?envType=problem-list-v2&envId=math
//3750. Minimum Number of Flips to Reverse Binary String

public class MinimumNumberOfFlipsReverseBinaryString {
    static void main(String[] args) {
        int n=10;
        System.out.println(minimumFlip(n));
    }
    static int  minimumFlip(int n) {
        String binary = Integer.toBinaryString(n);//1010    0101
        int count=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)!=binary.charAt(binary.length()-1-i)){
                count++;
            }
        }
        return count;
    }
}
