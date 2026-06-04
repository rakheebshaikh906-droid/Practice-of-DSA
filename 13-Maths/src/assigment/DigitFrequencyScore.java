package Assigment;

//https://leetcode.com/problems/digit-frequency-score/description/
//3945. Digit Frequency Score

public class DigitFrequencyScore {
    static void main(String[] args) {
        int n=122;
        System.out.println(digitFrequencyScore(n));
    }
    static int digitFrequencyScore(int n) {
        String arr=Integer.toString(n);
        int sum=0;
        for(int i=0;i<arr.length();i++){
            sum+=arr.charAt(i)-'0';
        }
        return sum;
    }
}
