package Assigment;

//https://leetcode.com/problems/alternating-digit-sum/description/?envType=problem-list-v2&envId=math
//2544. Alternating Digit Sum

public class AlternatingDigitSum {
    static void main(String[] args) {
        int n = 886996;
        System.out.println(alternateDigitSum(n));
    }
    static int alternateDigitSum(int n) {
        int sum=0;
        int sign=+1;
        String s=Integer.toString(n);
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            sum += sign * digit;
            sign = -sign;

        }
        return sum;
    }
}
