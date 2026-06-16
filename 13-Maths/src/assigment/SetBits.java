package Assigment;

//https://leetcode.com/problems/number-of-1-bits/description/
//191. Number of 1 Bits
public class SetBits {
    static void main(String[] args) {
        int n=11;
        System.out.println(hammingWeight(n));
    }
    static int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            count++;
            n-=(n&-n);
        }
        return count;
    }
}
