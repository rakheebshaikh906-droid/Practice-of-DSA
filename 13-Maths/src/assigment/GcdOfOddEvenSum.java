package Assigment;

public class GcdOfOddEvenSum {
    static void main(String[] args) {
        int n=5;
        System.out.println(gcdOfOddEvenSum(n));
    }
    static int gcdOfOddEvenSum(int n){
        int oddSum=n*n;
        int evenSum=n*(n+1);

        return gcd(oddSum,evenSum);
    }
    static int gcd(int a,int b){
        while( b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //2nd best approach
    static int gcdOddEven2(int n){
        return n;
    }
}
