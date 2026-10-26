package Assigment;

//https://leetcode.com/problems/binary-digit-score/
//4092. Binary Digit Score

public class BinaryDigitScore {
    static void main(String[] args) {
        int a=6;
        int b=8;
        System.out.println(calculateScore(a,b));

    }
    public static int calculateScore(int a, int b) {
        int s1=Integer.bitCount(a);
        int s2=Integer.bitCount(b);

        int ans = 0;
        if(s1>=s2){
            ans+=s1*s2;
        }else{
            ans+=s2/s1;
        }
        return ans;
    }
}
