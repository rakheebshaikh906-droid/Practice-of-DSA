package Assigment;

//https://leetcode.com/problems/sum-of-primes-between-number-and-its-reverse/
//3918. Sum of Primes Between Number and Its Reverse

public class SumOfPrimesInRange {
    static void main(String[] args) {
        int n = 123;
        System.out.println(sumOfPrimesInRange(n));
    }

    public static int sumOfPrimesInRange(int n) {
        int r = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            r = r * 10 + digit;
            temp /= 10;
        }

        int start = Math.min(n, r);
        int end = Math.max(n, r);

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }

    private static boolean isPrime(int a) {
        if (a < 2) {
            return false;
        }

        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
    }
}
