package Assigment;

//https://leetcode.com/problems/reverse-degree-of-a-string/description/
//3498. Reverse Degree of a String

public class ReverseDegreeOfString {
    static void main(String[] args) {
        String s="abc";
        System.out.println(reverseDegree(s));
    }
    static int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum +=('z'- s.charAt(i)+1)*i+1;
        }
        return sum;
    }
}
