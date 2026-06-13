package Assigment;

//https://leetcode.com/problems/powx-n/description/
//50. Pow(x, n)
public class Powxn {
    static void main(String[] args) {
        double x=2.00000;
        int n=10;
        System.out.println(myPow(x,n));
    }
    static double myPow(double x,int n){
        long pow = n;            // use long to avoid overflow for -2^31
        if (pow < 0) {
            x = 1.0 / x;
            pow = -pow;         // safe: -(-2^31) fits in long
        }

        double ans = 1.0;
        while (pow > 0) {
            if ((pow & 1) == 1) ans *= x;
            x *= x;
            pow >>= 1;
        }
        return ans;
    }
}
