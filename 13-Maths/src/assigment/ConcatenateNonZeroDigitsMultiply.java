package Assigment;

//https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/description/?envType=problem-list-v2&envId=math
//3754. Concatenate Non-Zero Digits and Multiply by Sum I

public class ConcatenateNonZeroDigitsMultiply {
    static void main(String[] args) {
        int n=10203004;
        System.out.println(sumAndMultiply(n));
    }
    static long sumAndMultiply(int n) {
        String s = String.valueOf(n);

        s = s.replace("0", "");

        long result = 0;
        if (!s.equals("")) {
            result = Long.parseLong(s);
        }

        int sum=0;
        while(n>0){
            int digit=n%10;
            if(digit!=0){
                sum+=digit;
            }
            n/=10;
        }
        long ans= (long) sum *result;

        return ans;

    }
}
