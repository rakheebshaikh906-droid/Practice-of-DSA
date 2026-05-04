package code;

public class Palindrome {
    static void main(String[] args) {
        int n=121;
        System.out.println(pali(n));
    }
    //in the palindrome we rev the number and check if rev number is == org number if its return true else false
    static int rev2(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
    static boolean pali(int n){
        return n==rev2(n);
    }
}
